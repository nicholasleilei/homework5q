package ������0713;

import java.util.Scanner;

public class �����͵��� {
public static void main(String[] args) {	Scanner s= new Scanner(System.in);
	int a=s.nextInt();int b=s.nextInt();
	doMax(a,b);
	doJvxing(a,b);
	System.out.println("�ϴ������");
	System.out.println(doMax(a,b));
	System.out.println(doDaxiao(a,b));	
}
public static int doMax(int a,int b) {
	if(a>=b) {
	return 	a;
	}else return b;
}
public static boolean doDaxiao(int a,int b) {
return a==b; 
}
public static void doJvxing(int a,int b) {
	int t=b; 
	for(;a>=1;a--) {	
	for(b=t;b>=1;b--) {
	System.out.print("x");
	}
	System.out.println();
}
}
}//��������ģ��βΣ������������Ͳ�ͬ���Ƿ�������ͬʱ������������