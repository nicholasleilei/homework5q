package ����0702��ҵ;

import java.util.Scanner;

public class ¼������ {
	 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("���������룺");
	
  a:  for(int i=1;i<=3;i++) {
    	int a= sc.nextInt();
    	if(a>999999||a<100000) {
    	System.out.println("������6λ��Ч����");i--;}
    	if(a==852147)   {
       System.out.println("��ӭ��"); break a;  }   
    	 else 
    	System.out.println("��������㻹��"+(3-i)+"�λ���"); 
    	if (i==3)
    		System.out.println("�̿�");
    }
	}
}
