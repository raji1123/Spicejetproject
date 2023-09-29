package utilityfile;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Fileutilspicejet extends Webutilspicejet{

	
	 static Properties pro;
	  public static String propertyfile(String key) {
		String value = null;
		try {
			
		
			
		File file=new File(".\\propertyfile\\spjet.properties");
		FileInputStream input=new FileInputStream(file);
		
		pro=new Properties();
		
		pro.load(input)	;
			
	     value=	pro.getProperty(key)	;
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;
		
		
		
	
		
		
	}
	
	
}
