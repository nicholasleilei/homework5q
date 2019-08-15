package 刘怡东0815;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import JDBC.Animals;

public class DBUtil {
	private static final String Driver = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/test";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "root";
	public static Connection conn = null;
	public static Statement stmt = null;

	public static Connection getconn() {
		try {
			Class.forName(Driver);
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}

	public static Statement getstmt() {
		try {
			stmt = getconn().createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return stmt;
	}

	public static void executeUp(String sql) {
		try {
			Statement stmt = getstmt();
			int i = stmt.executeUpdate(sql);
			if (i == 1) {
				System.out.println("您已对其进行改动");
			}
			if (i == 0) {
				System.out.println("改动无效");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void executeQu(String sql) {
		ResultSet rs;
		try {
			rs = stmt.executeQuery(sql);
			List<Animals> list = new ArrayList<>();
			while (rs.next()) {
				Animals a = new Animals();
				a.setID(rs.getInt(1));
				a.setName(rs.getString(2));
				a.setKind(rs.getString(3));
				a.setNumber(rs.getInt(4));
				a.setAddress(rs.getString(5));
				list.add(a);
			}
			for (Animals a : list) {
				System.out.println(a);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void closeconn() {
		try {
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void closestmt() {
		try {
			if (stmt != null) {
				stmt.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void closeAll() {
		closeconn();
		closestmt();
	}

}
