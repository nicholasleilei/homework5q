package ������0726;

import java.util.Scanner;

public class ����qq���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		��У��QQ���룬Ҫ��1.������5-15λ����  2.������0��ͷ
//		�������Ҫ�������¼�ɹ� ���������Ӧ����ʾ
		Scanner sc=new Scanner(System.in);
		System.out.println("���������QQ��");
		String qq=sc.next();
		 boolean f =true;
		if(qq.length()<5||qq.length()>15) {
			f=false;
			System.out.println("qq����ĳ���Ӧ��Ϊ5-15֮��");
		}
		if(qq.startsWith("0")) {
			f=false;
			System.out.println("������0��ͷ");
		}
		
		if(f) {
			System.out.println("��¼�ɹ�");
		}else {
			System.out.println("��¼ʧ��");
		}

	}

	}


