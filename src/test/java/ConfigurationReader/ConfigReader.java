package ConfigurationReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	// Create A Constructor
	// load ,getproperty--> properties is Class

	public static Properties p;

	public  ConfigReader() throws IOException {

		File f = new File("C:\\Users\\ELCOT\\eclipse-project\\Cucumber_8PM_FEB\\PropetiesFile\\config.properties"); // --->
																													// Location
		FileInputStream fis = new FileInputStream(f); // Get The Input value
		p = new Properties(); // Without using Extends Keywords i create Object

		p.load(fis);// Get Data From FileInputStream Then Load The In ..= New Properties();

	}

	public String getUrl() {
		String url = p.getProperty("url"); // Get the Datas From The new Properites();
		return url;
	}

	public String Getuser() {

		String user = p.getProperty("user");
		return user;
	}

}
