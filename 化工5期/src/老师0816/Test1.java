package 老师0816;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User u = new User(0,"张","8");
		//add(u);
		//update(new User(5,"李",""));
		//delete(10);
		//List<User> users = findAll();
//		User uu = findById(7);
//		System.out.println(uu);
		List<User> users = findByName("李");
		
		for(User uu:users) {
			System.out.println(uu);
		}
		
	}
	
	public static void add(User u) {
		String sql="insert into user values(null,'"+u.getUsername()+"','"+u.getPassword()+"')";
	     DBUtil.executeUp(sql);
	}
	public static void update(User u) {
		String sql="update user set username='"+u.getUsername()+"' where id="+u.getId();
		DBUtil.executeUp(sql);
	}
	public static void delete(int i) {
		String sql="delete from user where id="+i;
		DBUtil.executeUp(sql);
	}
	//查所有
	public  static List<User> findAll(){
		String sql="select * from user";
		return findBySQL(sql);
	}
	//按id查
	public static User findById(int id) {
		String sql="select * from user where id="+id;
		List<User> users =  findBySQL(sql); 
		return  users.size()>0?users.get(0):null;
	}
	//按用户名模糊查询
	public static List<User> findByName(String name){
		String sql="select * from user where username like '%"+name+"%'";
		return findBySQL(sql);
	}
	//按SQL语句查
	public static List<User> findBySQL(String sql){
		List<User>  users = new ArrayList<>();
		try {
			Statement stmt =DBUtil.getStmt();
			
			ResultSet rs =stmt.executeQuery(sql);
			while(rs.next()) {
				User u = new User();
				u.setId(rs.getInt(1));
				u.setUsername(rs.getString(2));
				u.setPassword(rs.getString(3));
				users.add(u);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return users;
	}

}
