package ����0702��ҵ;

import java.util.Scanner;

//����Ʒ�۸���1��100֮����������û��Ӽ��̲��ϲ£�����ϵͳ�ߵ���ʾ��ֱ��������Ʒ�۸�Ϊֹ
public class ����Ʒ�۸� {
public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	System.out.println("�°�1~100");
	int m=50;
	int a=sc.nextInt();
	if (a==m)
		System.out.println("�¶���");
	else if(a>m&&a<100)
	  System.out.println("��");
	else  if(a>0&&a<m)
	  System.out.println("��");
	else 
	  System.out.println("�۸���1~100֮��Ŷ");
}
}
