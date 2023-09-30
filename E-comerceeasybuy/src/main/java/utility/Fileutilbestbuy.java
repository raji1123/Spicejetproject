package utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Fileutilbestbuy extends WebUtilbestbuy{

	
	 static Properties pro;
	  public static String propertyfile(String key) {
		String value = null;
		try {
			
		
			
		File file=new File(".\\propertyfile\\bestbuy.properties");
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
