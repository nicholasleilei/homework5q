package ������0724;

import java.util.Scanner;

public class ���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("��������������˺�");
String i=sc.next();
int m=i.indexOf("@");
int n=i.indexOf(".");
if(m!=n+1&&m!=n-1&&m<i.length()&&n<i.length()&&n>m) {
	System.out.println("����Ϸ�");

	}
	
else {
		System.out.println("���䲻�Ϸ�����������ȷ������");
	}
}
}
