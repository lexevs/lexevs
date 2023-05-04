package org.lexevs.property.dao;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import org.LexGrid.LexBIG.Exceptions.LBParameterException;
import org.lexevs.locator.LexEvsServiceLocator;
import java.util.Arrays;
import java.util.Iterator;
import org.lexevs.logging.LoggerFactory;
import java.sql.SQLException;
import java.sql.ResultSet;
import org.springframework.jdbc.core.RowCallbackHandler;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcPropertyExtensionDao implements PropertyExtensionDao {
    private static String SEPARATOR;
    private static final String NCIT_URI = "http://ncicb.nci.nih.gov/xml/owl/EVS/Thesaurus.owl#";
    private static final String NCIT_CONCEPT_STATUS_PROPERTY = "Concept_Status";
    private static final String ENTITY_TABLE = "entity";
    private static final String PROPERTY_TABLE = "property";
    private static final String PROPERTY_COLUMN = "prop";
    private static final String ENTITY_CODE_COLUMN = "code";
    private transient JdbcTemplate jdbcTemplate;
    private static JdbcPropertyExtensionDao instance;

    static {
        JdbcPropertyExtensionDao.SEPARATOR = ";";
    }

    public static PropertyExtensionDao instance() {
        if (JdbcPropertyExtensionDao.instance == null) {
            JdbcPropertyExtensionDao.instance = new JdbcPropertyExtensionDao();
        }
        return (PropertyExtensionDao) JdbcPropertyExtensionDao.instance;
    }

    public Map<String, String> getProperty(final String uri, final String version, final String propertyName,
            final List<String> codes) {
        final Map<String, String> returnMap = new HashMap<String, String>();
        this.getJdbcTemplate().query(this.createPropertySelectSql(getPrefix(uri, version), propertyName, codes.size()),
                (Object[]) codes.toArray(new String[codes.size()]), this.getArgumentSqlTypes(codes.size()),
                (RowCallbackHandler) new RowCallbackHandler() {
                    public void processRow(final ResultSet rs) throws SQLException {
                        returnMap.put(rs.getString("code"), rs.getString("prop"));
                    }
                });
        return returnMap;
    }

    public Map<String, String> getConceptStatusForNCItCodes(final List<String> codes) {
        final Map<String, String> returnMap = new HashMap<String, String>();
        if (NCItConceptStatusCache.instance().isDone()) {
            LoggerFactory.getLogger().info("Using NCIt Concept Status cache");
            for (final String code : codes) {
                final String conceptStatus = NCItConceptStatusCache.instance().getConceptStatus(code);
                returnMap.put(code, conceptStatus);
            }
            return returnMap;
        }
        LoggerFactory.getLogger().info("NCIt Concept Status cache not ready -- querying database.");
        this.getJdbcTemplate().query(this.createPropertySelectSql(getNCItPrefix(), "Concept_Status", codes.size()),
                (Object[]) codes.toArray(new String[codes.size()]), this.getArgumentSqlTypes(codes.size()),
                (RowCallbackHandler) new RowCallbackHandler() {
                    public void processRow(final ResultSet rs) throws SQLException {
                        returnMap.put(rs.getString("code"), rs.getString("prop"));
                    }
                });
        return returnMap;
    }

    private int[] getArgumentSqlTypes(final int size) {
        final int[] types = new int[size];
        Arrays.fill(types, 12);
        return types;
    }

    private String createPropertySelectSql(final String prefix, final String propertyName, final int number) {
        final StringBuilder sb = new StringBuilder();
        sb.append(" SELECT entity.entityCode code, GROUP_CONCAT(entityProperty.propertyValue SEPARATOR '"
                + JdbcPropertyExtensionDao.SEPARATOR + "') " + "prop");
        sb.append(" FROM " + prefix + "entity" + " entity ");
        sb.append(" INNER JOIN " + prefix + "property" + " entityProperty");
        sb.append(" ON (entity.entityGuid = entityProperty.referenceGuid)");
        sb.append(" WHERE entity.entityCode IN (");
        for (int i = 0; i < number; ++i) {
            sb.append("?");
            if (i < number - 1) {
                sb.append(",");
            }
        }
        sb.append(")");
        sb.append(" AND entityProperty.propertyName = '" + propertyName + "'");
        sb.append(" GROUP BY code");
        return sb.toString();
    }

    protected static String getPrefix(final String uri, final String version) {
        return LexEvsServiceLocator.getInstance().getLexEvsDatabaseOperations().getPrefixResolver()
                .resolvePrefixForCodingScheme(uri, version);
    }

    private static String getNCItPrefix() {
        try {
            final String version = LexEvsServiceLocator.getInstance().getSystemResourceService()
                    .getInternalVersionStringForTag("http://ncicb.nci.nih.gov/xml/owl/EVS/Thesaurus.owl#",
                            (String) null);
            return getPrefix("http://ncicb.nci.nih.gov/xml/owl/EVS/Thesaurus.owl#", version);
        } catch (LBParameterException e) {
            throw new RuntimeException((Throwable) e);
        }
    }

    public JdbcTemplate getJdbcTemplate() {
        if (this.jdbcTemplate == null) {
            this.jdbcTemplate = new JdbcTemplate(
                    LexEvsServiceLocator.getInstance().getLexEvsDatabaseOperations().getDataSource());
        }
        return this.jdbcTemplate;
    }

    public static class NCItConceptStatusCache {
        private static NCItConceptStatusCache conceptStatusCache;
        private Map<Integer, String> conceptStatusIntToTypeMap;
        private Map<Integer, Integer> conceptStatusCodeToIntMap;
        private JdbcTemplate jdbcTemplate;
        private boolean isDone;

        private NCItConceptStatusCache() {
            this.conceptStatusIntToTypeMap = new HashMap<Integer, String>();
            this.conceptStatusCodeToIntMap = new HashMap<Integer, Integer>();
            this.isDone = false;
            (this.jdbcTemplate = new JdbcTemplate(
                    LexEvsServiceLocator.getInstance().getLexEvsDatabaseOperations().getDataSource()))
                    .setFetchSize(1000);
        }

        public static synchronized NCItConceptStatusCache instance() {
            if (NCItConceptStatusCache.conceptStatusCache == null) {
                NCItConceptStatusCache.conceptStatusCache = new NCItConceptStatusCache();
                final ExecutorService executor = Executors.newCachedThreadPool();
                executor.submit((Callable<Void>) new Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        NCItConceptStatusCache.conceptStatusCache.populateCache(getNCItPrefix());
                        return null;
                    }
                });
                executor.shutdown();
            }
            return NCItConceptStatusCache.conceptStatusCache;
        }

        protected void populateCache(final String prefix) {
            final Map<String, Integer> semTypeIntMap = new HashMap<String, Integer>();
            final StringBuilder sb = new StringBuilder();
            sb.append(" SELECT entity.entityCode code, GROUP_CONCAT(entityProperty.propertyValue SEPARATOR '"
                    + JdbcPropertyExtensionDao.SEPARATOR + "') " + "prop");
            sb.append(" FROM " + prefix + "entity" + " entity ");
            sb.append(" INNER JOIN " + prefix + "property" + " entityProperty");
            sb.append(" ON (entity.entityGuid = entityProperty.referenceGuid)");
            sb.append(" WHERE entityProperty.propertyName = 'Concept_Status'");
            sb.append(" GROUP BY code");
            this.jdbcTemplate.query(sb.toString(), (RowCallbackHandler) new RowCallbackHandler() {
                int conceptStatusCounter = 0;

                public void processRow(final ResultSet rs) throws SQLException {
                    final String code = rs.getString("code");
                    final String conceptStatus = rs.getString("prop");
                    final int codeInt = NCItConceptStatusCache.this.codeToInt(code);
                    int semTypeInt;
                    if (!semTypeIntMap.containsKey(conceptStatus)) {
                        semTypeIntMap.put(conceptStatus, this.conceptStatusCounter);
                        semTypeInt = this.conceptStatusCounter;
                        ++this.conceptStatusCounter;
                    } else {
                        semTypeInt = semTypeIntMap.get(conceptStatus);
                    }
                    NCItConceptStatusCache.this.conceptStatusCodeToIntMap.put(codeInt, semTypeInt);
                }
            });
            for (final Map.Entry<String, Integer> entry : semTypeIntMap.entrySet()) {
                this.conceptStatusIntToTypeMap.put(entry.getValue(), entry.getKey());
            }
            this.isDone = true;
        }

        public int codeToInt(final String code) {
            return code.hashCode();
        }

        public String getConceptStatus(final String code) {
            final int codeInt = this.codeToInt(code);
            final int semTypeInt = this.conceptStatusCodeToIntMap.get(codeInt);
            return this.conceptStatusIntToTypeMap.get(semTypeInt);
        }

        public boolean isDone() {
            return this.isDone;
        }
    }
}