package 老师0816;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class 事务 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection conn=null;
		Statement stmt=null;
		    try {
				Class.forName("com.mysql.jdbc.Driver");
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root","root");
				
				String sql1 ="insert into user values(null,'6','2')";
				String sql2 ="insert into user values(null,ab,'2')";
				String sql3 ="insert into user values(null,'2','2')";
				
				 stmt= conn.createStatement();
				//事务保证了数据的完整性、一致性
				conn.setAutoCommit(false);
				
				stmt.executeUpdate(sql1);
				stmt.executeUpdate(sql2);
				stmt.executeUpdate(sql3);
				
				
				
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				try {
					conn.rollback();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				e.printStackTrace();
			}
		    
		    stmt.close();
			conn.close();
	}

}
