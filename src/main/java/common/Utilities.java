package common;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import org.apache.commons.codec.binary.Base64;

public class Utilities {
	public static String getProperty(String key) throws Exception {
		String value = null;
		try {
			InputStream input = new FileInputStream("src/main/resources/config.properties");
			Properties property = new Properties();
			property.load(input);
			value = property.getProperty(key);
		}
		catch (Exception e) {
			//e.printStackTrace();
			throw new Exception ("Unable to get the property");
		}
		return value;
	}
	
	public static String decode(String encoded) {
		Base64 base64 = new Base64();
		byte[] decoded = base64.decode(encoded);
		String decodedString = new String(decoded);
		return decodedString;
	}
}
