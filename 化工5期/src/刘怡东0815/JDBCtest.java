package 刘怡东0815;

import java.util.Scanner;

public class JDBCtest {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("请输入指令");
		String sql = s.next();
		if (sql.substring(0, 6).equalsIgnoreCase("insert")) {
			DBUtil.executeUp(sql);
		} else {
			if (sql.substring(0, 6).equalsIgnoreCase("select")) {
				DBUtil.executeQu(sql);
			} else
				System.out.println("未知指令");
		}
		DBUtil.closeAll();

	}
}
