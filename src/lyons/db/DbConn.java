package lyons.db;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DbConn {
	
	
	
	public static Connection getConn()
	{
		
		Connection conn=null;
		Statement tsmt=null;
		String driver="com.mysql.jdbc.Driver";
		String username="root";
		String password="";
		String url="jdbc:mysql://loaclhost:3306:exercise";
		
		
		//�Ѽ�������
		try{
			Class.forName(driver);
			conn=DriverManager.getConnection(url,username,password);
			System.out.println("��mysql���ݿ����ӳɹ�");
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		return conn;
	}
}
