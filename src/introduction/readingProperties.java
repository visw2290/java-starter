package introduction;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class readingProperties {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path = "E:\\eclipse-workspace\\java-starter\\src\\introduction\\text.properties";
		Properties prop = new Properties();
		FileInputStream fs = new FileInputStream(path);
		
		prop.load(fs);
		System.out.println(prop.getProperty("name"));

	}

}
