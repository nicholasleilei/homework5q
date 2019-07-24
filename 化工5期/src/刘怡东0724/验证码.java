package 刘怡东0724;

import java.util.Scanner;

public class 验证码 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		boolean t = true;
		while (t) {
			String u = get();
			System.out.println(u);
			System.out.println("请输入验证码");
			String a = s.next();
			if (a.equalsIgnoreCase(u)) {
				System.out.println("通过验证");break;
			} else
				System.out.println("请重新输入");
		}

	}

	public static String get() {
		boolean u = true;
		char[] a = new char[4];
		while (u) {
			int O = (int) (97 + Math.random() * (122 - 97 + 1));
			char ch = (char) O;
			int o = (int) (65 + Math.random() * (90 - 65 + 1));
			char CH = (char) o;
			int n = (int) (48 + Math.random() * (10));
			char N = (char) n;
			int i = (int) (0 + Math.random() * (4));
			int i2 = (int) (0 + Math.random() * (4));
			int i3 = (int) (0 + Math.random() * (4));

			a[i] = ch;
			a[i2] = CH;
			a[i3] = N;
			if (a[0] != '\0' && a[1] != '\0' && a[2] != '\0' && a[3] != '\0') {
				break;
			}

		}
		return String.valueOf(a);
	}
}