package org.lexevs.property.impl;

import java.util.List;
import java.util.Map;
import org.LexGrid.LexBIG.DataModel.Core.AbsoluteCodingSchemeVersionReference;
import org.LexGrid.LexBIG.DataModel.Core.CodingSchemeVersionOrTag;
import org.LexGrid.LexBIG.DataModel.InterfaceElements.ExtensionDescription;
import org.LexGrid.LexBIG.Exceptions.LBParameterException;
import org.LexGrid.LexBIG.Extensions.ExtensionRegistry;
import org.LexGrid.LexBIG.Impl.Extensions.AbstractExtendable;
import org.LexGrid.LexBIG.Utility.ServiceUtility;
import org.lexevs.property.PropertyExtension;
import org.lexevs.property.dao.JdbcPropertyExtensionDao;
import org.lexevs.property.dao.PropertyExtensionDao;

public class PropertyExtensionImpl extends AbstractExtendable implements PropertyExtension {
    private static final long serialVersionUID = -8250950834910902457L;

    protected ExtensionDescription buildExtensionDescription() {
        ExtensionDescription ed = new ExtensionDescription();
        ed.setDescription("LexEVS Property Extension");
        ed.setExtensionClass(PropertyExtensionImpl.class.getName());
        ed.setExtensionBaseClass(PropertyExtension.class.getName());
        ed.setName("property-extension");
        ed.setVersion("1.0.0");
        return ed;
    }

    public Map<String, String> getConceptStatusForNCItCodes(List<String> codes) {
        return this.getPropertyExtensionDao().getConceptStatusForNCItCodes(codes);
    }

    public Map<String, String> getProperty(String codingSchemeName, CodingSchemeVersionOrTag csvt, String propertyName,
            List<String> codes) throws LBParameterException {
        AbsoluteCodingSchemeVersionReference ref = ServiceUtility
                .getAbsoluteCodingSchemeVersionReference(codingSchemeName, csvt, true);
        return this.getPropertyExtensionDao().getProperty(ref.getCodingSchemeURN(), ref.getCodingSchemeVersion(),
                propertyName, codes);
    }

    private PropertyExtensionDao getPropertyExtensionDao() {
        return JdbcPropertyExtensionDao.instance();
    }

    @Override
    protected void doRegister(ExtensionRegistry registry, ExtensionDescription description)
            throws LBParameterException {
        registry.registerGenericExtension(description);
        
    }
}