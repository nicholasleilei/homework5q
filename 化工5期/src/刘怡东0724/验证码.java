package ������0724;

import java.util.Scanner;

public class ��֤�� {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		boolean t = true;
		while (t) {
			String u = get();
			System.out.println(u);
			System.out.println("��������֤��");
			String a = s.next();
			if (a.equalsIgnoreCase(u)) {
				System.out.println("ͨ����֤");break;
			} else
				System.out.println("����������");
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