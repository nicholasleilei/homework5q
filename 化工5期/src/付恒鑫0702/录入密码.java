package ������0702;

import java.util.Scanner;

public class ¼������ {

	public static void main(String[] args) {
		/*
		 * .���¼��������� ��������852147,��ͨ������¼�룬 Ҫ���������֮��¼����ȷ����ʾ��ӭʹ���й����������� �����������������ϣ�����ʾ�̿�
		 * ÿ¼��1�Σ���ʾ�û����м��λ��ᡣ �û�¼������������6λ���֣� ����¼��1�Σ� ������ʾ��¼��6λ����
		 */

//		if(pass<=99999) {
//			System.out.println("������6λ����");
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

