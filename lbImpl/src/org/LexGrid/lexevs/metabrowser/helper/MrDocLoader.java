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
package org.LexGrid.lexevs.metabrowser.helper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The Class MrDocLoader.
 * 
 * @author <a href="mailto:kevin.peterson@mayo.edu">Kevin Peterson</a>
 */
public class MrDocLoader {
	
	/** The MRDO c_ file. */
	private static String MRDOC_FILE = "/MRDOC.RRF";
	
	/** The RELA. */
	private static String RELA = "RELA";
	
	/** The RELA. */
	private static String REL = "REL";
	
	/** The REL a_ inverse. */
	private static String RELA_INVERSE = "rela_inverse";
	
	/** The REL a_ inverse. */
	private static String REL_INVERSE = "rel_inverse";

	/**
	 * The main method.
	 * 
	 * @param args the arguments
	 */
	public static void main(String[] args){
		MrDocLoader l = new MrDocLoader();
		Map<String,String> map = l.getRelasAndReverseRelas();
		System.out.println(map);
	}
	
	/**
	 * Gets the relas and reverse relas.
	 * 
	 * @return the relas and reverse relas
	 */
	public Map<String,String> getRelasAndReverseRelas(){
		Map<String,String> relasAndInverses = new HashMap<String,String>();
		List<String> lines = readText(MRDOC_FILE);
		
		for(String line : lines){
			String[] tokens = line.split("\\|");
			if(tokens[0].equals(RELA) &&
					tokens[2].equals(RELA_INVERSE) && tokens.length > 3){
				relasAndInverses.put(tokens[1], tokens[3]);
			}
		}
		
		return relasAndInverses;
	}
	
	public Map<String,String> getRelsAndReverseRels(){
		Map<String,String> relsAndInverses = new HashMap<String,String>();
		List<String> lines = readText(MRDOC_FILE);
		
		for(String line : lines){
			String[] tokens = line.split("\\|");
			if(tokens[0].equals(REL) &&
					tokens[2].equals(REL_INVERSE) && tokens.length > 3){
				relsAndInverses.put(tokens[1], tokens[3]);
			}
		}
		
		return relsAndInverses;
	}

	/**
	 * Read text.
	 * 
	 * @param file the file
	 * 
	 * @return the list< string>
	 */
	private List<String> readText(String file) {
		InputStream is = null;
		BufferedReader br = null;
		String line;
		ArrayList<String> list = new ArrayList<String>();

		try { 
			is = this.getClass().getResourceAsStream(file);
			br = new BufferedReader(new InputStreamReader(is));
			while (null != (line = br.readLine())) {
				list.add(line);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if (br != null) br.close();
				if (is != null) is.close();
			}
			catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return list;
	}
}
