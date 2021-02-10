
package edu.mayo.informatics.lexgrid.convert.directConversions.medDRA;import java.io.File;import java.net.URI;import java.util.ArrayList;import java.util.List;import edu.mayo.informatics.lexgrid.convert.directConversions.medDRA.Data.MedDRA_Metadata;public class MedDRAFormatValidator {    private static MedDRA_Metadata [] meddraMetaData = MedDRA_Metadata.values();    public static boolean isValidDirectory(URI sourceDir) {        File dir = new File(sourceDir);        return dir.exists();    }    public static List<String> allMedDRAfilesExist(URI sourceDir) {        List<String> doesNotExist = new ArrayList<String>();        String input;                for(int i=0; i < meddraMetaData.length; i++){            input = sourceDir.getPath() + meddraMetaData[i].filename();            File file = new File(input);            if(!file.exists()){                doesNotExist.add(input);            }        }        return doesNotExist;    }    public static List<String> allMedDRAfilesNotEmpty(URI sourceDir) {        List<String> dataInvalid = new ArrayList<String>();        String input;                for(int i=0; i < meddraMetaData.length; i++){            input = sourceDir.getPath() + meddraMetaData[i].filename();            File file = new File(input);            if(!medDRAFileValid(file)){                dataInvalid.add(input);            }        }        return dataInvalid;    }        private static boolean medDRAFileValid(File file){        if(file.length() > 0){            return true;        }                return false;    }}