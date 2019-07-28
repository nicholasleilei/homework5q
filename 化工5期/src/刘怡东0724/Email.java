package 刘怡东0724;

import java.util.Scanner;

public class Email {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("请输入邮箱");
		boolean t = true;
		while (t) {
			String a = s.next();
			int i = a.indexOf("@"), j = a.indexOf(".");
			if (i < j && j - i > 1 && j < a.length() - 1) {
				System.out.println("欢迎");
				break;
			} else {
				System.out.println("邮箱格式不正确,請重新輸入");
			}
		}
	}
}
