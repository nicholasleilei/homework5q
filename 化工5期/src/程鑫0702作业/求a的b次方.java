package 程鑫0702作业;

import java.util.Scanner;

public class 求a的b次方 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("请输入");
	int a=sc.nextInt();
	int b=sc.nextInt();
	for(int n=1;n<=b;n++) {
		int m=a*a;	
		System.out.println(m);break;
	}	
	
	
	
}
}
