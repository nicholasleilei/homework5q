package ������0702;

import java.util.Scanner;

public class �˺����� {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String MIMA="1234";
	String NAME="lyd";
	boolean a=true;int  i=0;
while(a){
	System.out.println("�û���");String name=sc.next();
	System.out.println("����");String mima=sc.next();
		if(name.equals(NAME)&&mima.equals(MIMA)) {
			System.out.println("��ӭ��");break;
		}else {i++;
			System.out.println("�������");}
	if(i==3) {
		System.out.println("����,���뱻��");break;
	}
}}
}
