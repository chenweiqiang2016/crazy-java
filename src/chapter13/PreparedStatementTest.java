package chapter13;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Properties;

public class PreparedStatementTest {
	
	private String driver;
	
	private String url;
	
	private String user;
	
	private String password;
	
	public void initParam(String filename) throws Exception{
		Properties p = new Properties();
		p.load(new FileInputStream(filename));
		driver = p.getProperty("driver");
		url = p.getProperty("url");
		user = p.getProperty("user");
		password = p.getProperty("password");
		//这一句忘记写了也正常执行了
		Class.forName(driver);
	}
	
	public void insertByStatement() throws Exception{
		try(
				Connection conn = DriverManager.getConnection(url,user,password);
				Statement stmt = conn.createStatement();
				){
		long start = System.currentTimeMillis();
		for(int i=1; i<=1000; i++){
		String sql = "insert into students values (null, " + "'姓名" + i + "', 1)";
		stmt.executeUpdate(sql);
		}
		System.out.println("Statement语句执行一千次插入耗时: " + (System.currentTimeMillis()-start));
		}
	}
	
	public void insertByPreparedStatement() throws Exception{
		try(
				Connection conn = DriverManager.getConnection(url,user,password);
				PreparedStatement pStmt = conn.prepareStatement("insert into students values (null, ?, 1)");
				){
			long start = System.currentTimeMillis();
			for(int i=1; i<=1000; i++){
				pStmt.setString(1, "姓名" + i);
				pStmt.executeUpdate();
			}
			
		System.out.println("PreparedStatement语句执行一千次插入耗时: " + (System.currentTimeMillis()-start));
			
		}
	}
	
	public static void main(String[] args) throws Exception{
		PreparedStatementTest t = new PreparedStatementTest();
		t.initParam("resources/jdbc.properties");
		t.insertByStatement();
		t.insertByPreparedStatement();
	}

}
