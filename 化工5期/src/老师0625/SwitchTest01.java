package ��ʦ0625;

import java.util.Scanner;

public class SwitchTest01 {

	public static void main(String[] args) {
		// ����¼��һ��������������������Ӧ������
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ������");
		int n = sc.nextInt();
		switch (n) {
		case 1:
		case 8:
			System.out.println("����һ");
			break;
		case 2:
			System.out.println("���ڶ�");
			break;
		case 3:
			System.out.println("������");
			break;
		case 4:
			System.out.println("������");
			break;
		case 5:
			System.out.println("������");
			break;
		case 6:
			System.out.println("������");
			break;
		case 7:
			System.out.println("������");
			break;

		default:
			System.out.println("¼�����");
			break;
		}
	}

}
