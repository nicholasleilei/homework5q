package ������0726;

import java.util.Scanner;

public class qq�� {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("������qq��");
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
			System.out.println("��½�ɹ�");
		} else {
			System.out.println("��������ȷ��qq��");
		}

	}
}
