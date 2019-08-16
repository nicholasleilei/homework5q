package ¿œ ¶0816;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         try {
        	 Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root","root");
			
			String sql ="insert into user values(null,?,?)";
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, "11111");
			stmt.setString(2, "33333");
			
			String sql1 = "insert into user values(null,'aaa','bbb')";
			String sql2 = "insert into user values(null,'ccc','bbb')";
			String sql3 = "insert into user values(null,'ddd','bbb')";
			
			stmt.addBatch(sql1);
			stmt.addBatch(sql2);
			stmt.addBatch(sql3);
			
			stmt.executeBatch();
			//stmt.executeUpdate();
			
			stmt.close();
			conn.close();
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         
	}

}
