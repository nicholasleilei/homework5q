package ����0808��ҵ;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class �û�ע�� {

	public static void main(String[] args) throws IOException {
		// TODO �Զ����ɵķ������
File u=new File("d://user");
String q="d://user";
u.mkdirs();
Scanner sc=new Scanner(System.in);
System.out.println("�������¼�˺�");
System.out.println("����������");
int z=sc.nextInt();
String m=sc.next();
File w=new File(q+"//"+z+"//");
File e=new File(q+"//"+z+"//"+m);
if(w.exists()) {
	if(e.exists())
	System.out.println("��¼�ɹ�");
	else
		System.out.println("�������");
}
else {
	System.out.println("δ��⵽�д��˺ţ���ע��");
System.out.println("��ע���˺ţ�");
System.out.println("����������");	
		int a=sc.nextInt();
		  String b=sc.next();
	u=new File(q+"//"+a+"//");
		u.mkdirs();
u=new File(q+"//"+a+"//"+b);
	if(u.createNewFile())
		System.out.println("�����ɹ�");
	else
		System.out.println("���˺��Ѿ���ע��");
	}
	}
}
