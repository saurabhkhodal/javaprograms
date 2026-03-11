package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class ReadPropertiesFile {

	public static void main(String[] args) throws IOException {
		 Properties property = new Properties();
         FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\TestData\\config.properties");
         property.load(file);
         
         String url = property.getProperty("appurl");
         String email = property.getProperty("email");
         String password = property.getProperty("password");
         
         System.out.println("url: "+url + "\t email : "+email + " \t password: "+password);
         
         //capture all the keys from the properties file
         
         //Method 1
         
         Set <String> keys = property.stringPropertyNames();
         System.out.println(keys);
         
         //Method 2
         
         Set<Object>key = property.keySet();
         System.out.println(key);
         
         //capture all the values from the properties file
         
         Collection <Object> values=property.values();
         System.out.println(values);
         
         file.close();
         
         
	}

}
