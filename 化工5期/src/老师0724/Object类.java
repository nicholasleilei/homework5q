package ��ʦ0724;

import java.util.Scanner;

public class Object�� {
String a="";
Scanner sc;
public static void main(String[] args) {
	Person p = new Person("����","��");
	Person p1 = new Person("����","��");
	 
	System.out.println(p.hashCode());
	System.out.println(p1.hashCode());
	
	//�������������ͬһ������ ��ô���ǵ�hashcodeһ����ͬ
	//������������hashcode��ͬ����ô����Ҳ��һ����ͬһ������
//	final finally finalize ����
	String aa="123";
	       aa="333";
}
}
