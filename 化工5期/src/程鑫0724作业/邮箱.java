package ����0724��ҵ;

import java.util.Scanner;

public class ���� {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
Scanner sc =new Scanner(System.in);
System.out.println("����������");

	
for(;;) {
String a=sc.next();
int m=a.indexOf("@");
int n=a.indexOf(".");
 if (m<n && n- m> 1 && n < a.length() - 1) {
	System.out.println("��ӭ��");break;
}else {
	System.out.println("�����ʽ��������������");
}}
	}

}
