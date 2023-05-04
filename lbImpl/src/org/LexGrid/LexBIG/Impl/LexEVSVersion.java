
package org.LexGrid.LexBIG.Impl;

/**
 * Class that displays the version and timestamp of the last LexEVS service 
 * that was built. 
 * 
 * During the ant build, this file is copied to 
 * lbImpl/src/org/LexGrid/LexBIG/Impl/LexEVSVersion.java and the version 
 * and timestamp are updated with the current values.
 */
public class LexEVSVersion {
    private static final String VERSION = "6.6.1.RC2";
    private static final String TIMESTAMP = "2023-03-23_11:01:40";
    
    public static String getLexEVSBuildVersion(){
        return VERSION;
    }
    
    public static String getLexEVSBuildTimestamp(){
        return TIMESTAMP; 
    } 
}