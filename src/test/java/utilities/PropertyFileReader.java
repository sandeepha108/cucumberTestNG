package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyFileReader {

	Properties prop;

	public PropertyFileReader() {

		prop = new Properties();
		try {
			prop.load(new FileInputStream("./configurations/browser-config.properties"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public String getUserName() {
		return prop.getProperty("username");

	}
	public String getPassword() {
		return prop.getProperty("password");

	}
	public String getBrowserName() {
		return prop.getProperty("browser");

	}
	public String getChromePath() {
		return prop.getProperty("chromepath");

	}
	

}
