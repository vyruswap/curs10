package curs10;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesLegume {

	public void readProperties(String key) throws IOException {
		InputStream inputStream = new FileInputStream("legume");
		Properties legumeProperties = new Properties();
		legumeProperties.load(inputStream);
		String calorieLegume = legumeProperties.getProperty(key.toLowerCase());
		System.out.println("Leguma " + key + " are " + calorieLegume + " calorii");

	}

}