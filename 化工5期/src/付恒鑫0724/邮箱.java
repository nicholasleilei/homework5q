package 付恒鑫0724;

import java.util.Scanner;

public class 邮箱 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("请输入你的邮箱账号");
String i=sc.next();
int m=i.indexOf("@");
int n=i.indexOf(".");
if(m!=n+1&&m!=n-1&&m<i.length()&&n<i.length()&&n>m) {
	System.out.println("邮箱合法");

	}
	
else {
		System.out.println("邮箱不合法，请输入正确的邮箱");
	}
}
}
