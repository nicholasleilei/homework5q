package 付恒鑫0702;

import java.util.Scanner;

public class 求次方 {

	public static void main(String[] args) {
		//从键盘录入a和b两个数字，求a的b次方
		int sum=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入第一个数");
		int a=sc.nextInt();
		System.out.println("请输入下一个数");
		int b=sc.nextInt();
		for(int i=2;i<=b;i++) {
			
			a*=a;
		}
System.out.println(a);
	}

}
