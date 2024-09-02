package Sample_properties;

import java.io.FileInputStream;
import java.util.Properties;

public class Sample_properties {

	public static void main(String[] args) throws Exception {
	FileInputStream fis = new FileInputStream("C:\\selenium\\karthik.properties");
	Properties pobj = new Properties();
	pobj.load(fis);
	String URL = pobj.getProperty("URL");
	String UNAME = pobj.getProperty("USERNAME");
	String PASS = pobj.getProperty("PASSWORD");
	
	System.out.println(URL);
	System.out.println(UNAME);
	System.out.println(PASS);
	
	

	}

}
