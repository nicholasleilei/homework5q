package ��ʦ0710;

import java.util.Scanner;

public class ������ϰ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1.�Զ��巽��������¼�������������ؽϴ�ֵ

		//2.�Զ��巽��������¼�����������Ƚ��Ƿ����
//		3.���巽��������¼���к��У������Ӧ�к��еľ���
		Scanner sc = new Scanner(System.in);
		System.out.println("��������������");
		int a = sc.nextInt();
		int b=sc.nextInt();
		getMax(a, b);
		System.out.println(isEq(a, b));
		printJu(a,b);
	}
	public static void getMax(int a,int b) {
		System.out.println(a>b?a:b);
	}
	public static String isEq(int a,int b) {
		return a==b?"���":"����";
	}
    public static void printJu(int a,int b) {
    	
    	for(;a>=1;a--) {
    		for(int j=1;j<=b;j++) {
    			System.out.print("*");
    		}
    		System.out.println();
    	}
    }
}
