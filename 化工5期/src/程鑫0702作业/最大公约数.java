package ����0702��ҵ;

import java.util.Scanner;

public class ���Լ�� {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("������������");
	int a=sc.nextInt();
	int b=sc.nextInt();
	for (int i =65535;; i--) {
		if (a % i == 0 && b % i == 0) {
			System.out.print("���Լ����");
			System.out.println(i);
			break ;}
	
	}
}
}
