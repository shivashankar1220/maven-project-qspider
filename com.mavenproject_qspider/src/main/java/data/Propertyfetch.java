package data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Propertyfetch {
public String fetchdata(String key) throws Throwable
	{
	FileInputStream fis=new FileInputStream("./src/test/resources/com.vtiger.qspider");
	Properties po=new Properties();
	po.load(fis);
	String data=po.getProperty(key);
	return data;
	}
}
