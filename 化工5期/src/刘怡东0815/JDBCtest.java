package ������0815;

import java.util.Scanner;

public class JDBCtest {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("������ָ��");
		String sql = s.next();
		if (sql.substring(0, 6).equalsIgnoreCase("insert")) {
			DBUtil.executeUp(sql);
		} else {
			if (sql.substring(0, 6).equalsIgnoreCase("select")) {
				DBUtil.executeQu(sql);
			} else
				System.out.println("δָ֪��");
		}
		DBUtil.closeAll();

	}
}
