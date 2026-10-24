package QspidersDemoAppAssignment;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class QspiderUtility {

	public static String fromProperties(String key) throws IOException {
		Properties prop = new Properties();
		FileInputStream file = new FileInputStream(".\\src\\test\\resources\\WebElementFile");
		prop.load(file);
		return prop.getProperty(key);
	}
}