package fileUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class propertiesFileUtility {

		
		public String readDataFromProperty(String key) throws IOException 
		{
			FileInputStream fis=new FileInputStream(IpathConstant.proppath);
			Properties pf=new Properties();
			pf.load(fis);
			String value=pf.getProperty(key);
			return value;
			
		}
}
