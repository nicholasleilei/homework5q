package 程鑫0702作业;

import java.util.Scanner;

public class 最大公约数 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("请输入两个数");
	int a=sc.nextInt();
	int b=sc.nextInt();
	for (int i =65535;; i--) {
		if (a % i == 0 && b % i == 0) {
			System.out.print("最大公约数是");
			System.out.println(i);
			break ;}
	
	}
}
}
