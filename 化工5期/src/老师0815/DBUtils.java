package ¿œ ¶0815;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtils {
	private final static String DRIVER="com.mysql.jdbc.Driver";
	private final static String URL="jdbc:mysql://localhost:3306/mydb";
	private final static String USERNAME="root";
	private final static String PASSWORD="root";
	
	public static Connection getConn() {
		Connection conn=null;
		try {
			Class.forName(DRIVER);
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	
	public static Statement getStmt() {
		Statement stmt=null;
		try {
			stmt = getConn().createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return stmt;
	}
	
	public static void executeUp(String sql) {
		try {
			Statement stmt = getStmt();
			stmt.executeUpdate(sql);
			stmt.close();	
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
