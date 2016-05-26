package chapter13;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;

/**
 * 使用statement的executeUpdate()方法
 */

public class ExecuteDDL {
	private String url;
	
	private String user;
	
	private String password;
	
	
	public void initParam(String filename) throws Exception{
		Properties p = new Properties();
		p.load(new FileInputStream(filename));
		url = p.getProperty("url");
		user = p.getProperty("user");
		password = p.getProperty("password");
	}
	
	public int createTable(String sql) throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		try(
			Connection conn = DriverManager.getConnection(url, user, password);
			Statement stat = conn.createStatement();
		){
			int count = stat.executeUpdate(sql);
			
			return count;
		}
		
	}
	
	public static void main(String[] args) throws Exception{
		ExecuteDDL exddl = new ExecuteDDL();
		exddl.initParam("resources/jdbc.properties");
		int count = exddl.createTable("create table students("
				 + "student_id int(11) auto_increment primary key,"
				 + "student_name varchar(256),"
				 + "java_teacher int(11));"
				);
		System.out.println("受影响的记录条数是" + count);
	}

}
