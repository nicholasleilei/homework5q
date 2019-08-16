package ��ʦ0816;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil {
   private static final String  DRIVER="com.mysql.jdbc.Driver";
   private static final String URL="jdbc:mysql://localhost:3306/test";
   private static final String USERNAME="root";
   private static final String PASSWORD="root";
   
	private static Connection conn=null;
	private static Statement stmt =null;
	
	
	public static Connection getConn() {
		try {
			Class.forName(DRIVER);
			conn = DriverManager.getConnection(URL, USERNAME,PASSWORD);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	
	public static Statement getStmt() {
		 try {
			stmt = getConn().createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 return stmt;
	}
	
	public static void executeUp(String sql) {
		Statement stmt =getStmt();
		try {
			stmt.executeUpdate(sql);
			
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
