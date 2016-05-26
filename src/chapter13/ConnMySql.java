package chapter13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Statement 的 executeQuery方法
 */

public class ConnMySql {
	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		try
		(
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/aims?useUnicode=true&characterEncoding=gbk", "root", "");
		Statement stmt = conn.createStatement();
		//直接写进来 不能声明String sql = ...		
		ResultSet rs = stmt.executeQuery("select * from students");

		)
		{

			while(rs.next()){
				System.out.print(rs.getString(1) + "\t"
						        +rs.getString(2) + "\t"
						        +rs.getString(3));
				System.out.println();
			}
		}
	}
}
