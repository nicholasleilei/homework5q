package ������0702;

import java.util.Scanner;

public class ���Լ�� {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		t: for (int i =65535;; i--) {
			if (a % i == 0 && b % i == 0) {
				System.out.print("�������������Լ����");
				System.out.println(i);
				break t;
			}
			if (i == 0) {
				System.out.println("��������û�����Լ��");
				break t;
			}
		}

	}

}
