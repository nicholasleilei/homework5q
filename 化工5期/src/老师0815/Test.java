package 老师0815;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		//JDBC  Java  DataBase  Connection
      /*
       * 1.加载驱动
       * 2.获得链接
       * 3.获得语句对象
       * 4.增删改 --executeUpdate（） --------------int  
       *                              查询   ---   executeQuery（）    ---------------- ResultSet（结果集）
       * 5.将结果集 转为List
       * 6.关闭资源
       */
	  Employee e = new Employee("张三","男",18," 长春市");
	 // add(e);
	  //update(e);
	  //delete("张三");
	  List<Employee> list= findAll();
	  for(Employee a:list) {
			System.out.println(a);
		}
	}
	
	public static void add(Employee e) {
		String sql="insert into employee values('"+e.getName()+"','"+e.getSex()+"',"+e.getAge()+",'"+e.getAddress()+"')";
		DBUtils.executeUp(sql);
	}
	public static void update(Employee e) {
		String sql="update employee set address='"+e.getAddress()+"' where name='"+e.getName()+"'";
		DBUtils.executeUp(sql);
	}
	public static void delete(String name) {
		String sql="delete from employee where name='"+name+"'";
		DBUtils.executeUp(sql);
	}
	public static List<Employee> findAll() {
		String sql="select * from employee";
		List<Employee>  list = new ArrayList<>();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				Employee e = new Employee();
				e.setName(rs.getString(1));
				e.setSex(rs.getString(2));
				e.setAge(rs.getInt(3));
				e.setAddress(rs.getString(4));
				list.add(e);
			}
			
		} catch (ClassNotFoundException | SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return list;
		
	}

}
