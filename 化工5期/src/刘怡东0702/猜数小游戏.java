package ������0702;

import java.util.Scanner;

public class ����С��Ϸ {
public static void main(String[] args) {
	int a= (int)(0+Math.random()*(99-0+1));
	Scanner s= new Scanner(System.in);
	
	for(int i =1;;i++) {int b=s.nextInt();
		if(b>a) {System.out.println("̫��");continue;}
		if(b<a) {System.out.println("̫С");continue;}
		if(b==a) {System.out.print("�¶��ˣ�");
		 if(i==1) {System.out.println("��̫�����ˣ�");}
		 if(i<=5&&i>=2) {System.out.println("���������ģ�");}
		 if(i>=5) {System.out.println("������");}
		break;}
	}
}
}
