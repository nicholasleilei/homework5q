package ������0702;

import java.util.Scanner;

public class ¼��������� {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int mima=852147;int c;
		System.out.println("������6λ������");
		
		for(int i=3;;i--) {p: for(;;) {
		int a=s.nextInt();		
		if(a>=99999) {c=a;
			break p;
		}else System.out.println("��¼��6λ����");}
		if(c==mima) {
	    System.out.println("��ӭʹ���й���������");break;}
		else {
		System.out.println("¼�������");
		System.out.println(i-1);
		System.out.println("�λ���");
		if(i<=1) {System.out.println("�̿�,����������������");break;}}
		
		}
	}

}
