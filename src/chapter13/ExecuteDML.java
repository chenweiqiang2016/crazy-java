package chapter13;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;


public class ExecuteDML {
	String driver;
	String url;
	String user;
	String password;

	public void initParam(String filename) throws Exception{
		Properties p = new Properties();
		p.load(new FileInputStream(filename));
		driver = p.getProperty("driver");
		url = p.getProperty("url");
		user = p.getProperty("user");
		password = p.getProperty("password");
	}
	
	public int insertData(String sql) throws Exception{
		Class.forName(driver);
		try(
				Connection conn = DriverManager.getConnection(url, user, password);
				Statement statement = conn.createStatement();
		){
			return statement.executeUpdate(sql);
		}
	}

	public static void main(String[] args) throws Exception{
		ExecuteDML exDML = new ExecuteDML();
		exDML.initParam("resources/jdbc.properties");
		int count = exDML.insertData("insert into students values "
				         + "(null, 'chenweiqiang', 1),"
				         + "(null, 'zhaopengfei', 2)," 
				         + "(null, 'lixiang', 1);");
		System.out.println("受影响的记录条数是: " + count);
	}
}
