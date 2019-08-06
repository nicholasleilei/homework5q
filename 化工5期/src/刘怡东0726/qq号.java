package 刘怡东0726;

import java.util.Scanner;

public class qq号 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("请输入qq号");
		String S = s.next();
		boolean t = true;
		if (S.length() > 15 || S.length() < 5) {
			t = false;
		}
		for (char i : S.toCharArray()) {
			if (Character.isDigit(i)) {
			} else {
				t = false;
			}
		}
		if (S.startsWith("0")) {
			t = false;
		}
		if (t) {
			System.out.println("登陆成功");
		} else {
			System.out.println("请输入正确的qq号");
		}

	}
}
