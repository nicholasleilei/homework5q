package ������0710;

import java.util.Scanner;

public class �������ֵ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			System.out.println("��������������");
			int a=sc.nextInt();
			int b=sc.nextInt();
			getMax(a, b);
			equal(a, b);
		}		
		
	public static void equal(int a,int b) {
	System.out.println(a==b?"���":"�����");	
	}
	

public static void getMax(int a,int b) {
	System.out.println(a>b?a:b);
	}
}
