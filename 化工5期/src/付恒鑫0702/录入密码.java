package ������0702;

import java.util.Scanner;

public class ¼������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1;i<=3;i++) {
		Scanner sc=new Scanner(System.in);
		System.out.println("����������");
		String pass=sc.next();
		if(pass.equals("852147")) {
			System.out.println("��ӭʹ���й���������");
			break;
			
		}else if(i==1) {
			System.out.println("��������㻹�����λ���");
		}
		else if(i==2) {
			System.out.println("��������㻹��һ�λ���");
		}else {
			System.out.println("���ѱ��̿�");
		}
		
	}
	}

}
