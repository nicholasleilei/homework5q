package ������0724;

import java.util.Scanner;

public class ���֤ {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("���������֤��");
	String id=s.next();
	if(id.charAt(16)%2==0) {
		System.out.println("Ů");
		
	}else System.out.println("��");
	System.out.println("��������"+id.substring(6, 14));
	
	
}
}
