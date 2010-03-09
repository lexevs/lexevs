/*
 * Copyright: (c) 2004-2009 Mayo Foundation for Medical Education and 
 * Research (MFMER). All rights reserved. MAYO, MAYO CLINIC, and the
 * triple-shield Mayo logo are trademarks and service marks of MFMER.
 *
 * Except as contained in the copyright notice above, or as used to identify 
 * MFMER as the author of this software, the trade names, trademarks, service
 * marks, or product names of the copyright holder shall not be used in
 * advertising, promotion or otherwise in connection with this software without
 * prior written authorization of the copyright holder.
 * 
 * Licensed under the Eclipse Public License, Version 1.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at 
 * 
 * 		http://www.eclipse.org/legal/epl-v10.html
 * 
 */
package edu.mayo.informatics.resourcereader.obo;

import java.util.Collection;
import java.util.Hashtable;
import java.util.TreeSet;
import java.util.Vector;

import org.LexGrid.LexBIG.Utility.logging.CachingMessageDirectorIF;

import edu.mayo.informatics.resourcereader.core.StringUtils;
import edu.mayo.informatics.resourcereader.core.IF.ResourceEntity;
import edu.mayo.informatics.resourcereader.core.IF.ResourceException;

/**
 * The class stores informatiom about the list of OBO Terms
 * 
 * @author <A HREF="mailto:sharma.deepak2@mayo.edu">Deepak Sharma</A>
 * @author <A HREF="mailto:kanjamala.pradip@mayo.edu">Pradip Kanjamala</A>
 * @version subversion $Revision: $ checked in on $Date: $
 */
public class OBOTerms extends OBOCollection {
    private Hashtable<String, OBOTerm> termsByID = new Hashtable<String, OBOTerm>();
    // Added Vector below so we have a way of returning terms in the same order
    // they were read

    private Vector<OBOTerm> terms = new Vector<OBOTerm>();

    public OBOTerms(CachingMessageDirectorIF rLogger) {
        super(rLogger);
    }

    public void addMember(ResourceEntity termp) throws ResourceException {
        if ((termp != null) && (termp instanceof OBOTerm)) {
            OBOTerm term = (OBOTerm) termp;

            if (!StringUtils.isNull(term.id)) {
                terms.add(term);
                if ((terms.size() % 5000) == 0) {
                    logger.debug("Read " + terms.size() + " terms. Last term read had term id=" + term.id);
                }
                if (!termsByID.containsKey(term.id))
                    termsByID.put(term.id, term);
            }
        }
    }

    public OBOTerm getMemberById(String id) throws ResourceException {
        return termsByID.get(id);
    }

    public Collection<OBOTerm> getAllMembers() {
        return terms;
    }

    public long getMembersCount() {
        return termsByID.size();
    }

    public String toString() {
        return terms.toString();

    }

    public String getTermPrefix() {
        if (!terms.isEmpty()) {
            return terms.firstElement().prefix;
        } else {
            return "";
        }
    }

    public TreeSet getNameSpaceSet() {
        TreeSet<String> namespaces = new TreeSet<String>();
        for (OBOTerm term : terms) {
            if (!StringUtils.isNull(term.namespace))
                namespaces.add(term.namespace);
        }
        return namespaces;
    }

}