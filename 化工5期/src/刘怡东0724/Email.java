package ������0724;

import java.util.Scanner;

public class Email {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("����������");
		boolean t = true;
		while (t) {
			String a = s.next();
			int i = a.indexOf("@"), j = a.indexOf(".");
			if (i < j && j - i > 1 && j < a.length() - 1) {
				System.out.println("��ӭ");
				break;
			} else {
				System.out.println("�����ʽ����ȷ,Ո����ݔ��");
			}
		}
	}
}
