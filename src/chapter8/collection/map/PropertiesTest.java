package chapter8.collection.map;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.Properties;

/**
 * setProperty getProperty load store
 */

public class PropertiesTest {

	public static void main(String[] args) throws Exception{
		Properties m = new Properties();
		m.setProperty("name", "chenweiqiang");
		m.setProperty("age", "25");
		
		m.store(new FileOutputStream("a.ini"), "用户信息");
		
		Properties m2 = new Properties();
		m2.setProperty("gender", "male");
		m2.load(new FileInputStream("a.ini"));
		System.out.println(m2);
		
		m2.storeToXML(new FileOutputStream("a.xml"), "用户信息");

	}

}
