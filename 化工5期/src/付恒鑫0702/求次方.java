package ������0702;

import java.util.Scanner;

public class ��η� {

	public static void main(String[] args) {
		//�Ӽ���¼��a��b�������֣���a��b�η�
		int sum=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("�������һ����");
		int a=sc.nextInt();
		System.out.println("��������һ����");
		int b=sc.nextInt();
		for(int i=2;i<=b;i++) {
			
			a*=a;
		}
System.out.println(a);
	}

}
