package chapter13;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

/**
 * 直接使用execute方法
 */

public class ExecuteMethod {
	
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
	}
	
	public void executeSQL(String sql) throws Exception{
		Class.forName(driver);
		try(
			Connection conn = DriverManager.getConnection(url, user, password);
			Statement stmt = conn.createStatement();
        ){
			boolean hasResultSet = stmt.execute(sql);
			if(hasResultSet){
				ResultSet rs = stmt.getResultSet();
				//由ResultSet获取结果的元数据
				int columnCount = rs.getMetaData().getColumnCount();
				while(rs.next()){
					for(int i=0; i<columnCount; i++){
						System.out.print(rs.getString(i+1) + "\t");
					}
					System.out.println("\n");
				}
			}else{
				int count = stmt.getUpdateCount();
				System.out.println("受影响的条数为" + count);
			}
			
		}
	}
	
	public static void main(String[] args) throws Exception{
		ExecuteMethod em = new ExecuteMethod();
		em.initParam("resources/jdbc.properties");
		System.out.println("----初始化----");
		em.executeSQL("drop table if exists teachers");
		System.out.println("----建表----");
		em.executeSQL("create table teachers("
				+ "teacher_id int(11) auto_increment primary key,"
				+ "teacher_name varchar(256),"
				+"level char(1))");
		
		System.out.println("----插入数据----");
		//错误写法: insert into table
		em.executeSQL("insert into teachers values" 
				+ " (null, 'lina', 'A'),"
				+ " (null, 'lujianhua', 'B'),"
				+ " (null,'yangyiqing', 'C'),"
				+ " (null, 'lvyinghong', 'A')");
		
		System.out.println("----查询数据----");
		em.executeSQL("select * from teachers");
		
		System.out.println("----更新数据----");
		em.executeSQL("update teachers set level='A' where teacher_name='lujianhua'");
		
		
	}

}
