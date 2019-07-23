package 付恒鑫0710;

import java.util.Scanner;

public class 返回最大值 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			System.out.println("请输入两个数：");
			int a=sc.nextInt();
			int b=sc.nextInt();
			getMax(a, b);
			equal(a, b);
		}		
		
	public static void equal(int a,int b) {
	System.out.println(a==b?"相等":"不相等");	
	}
	

public static void getMax(int a,int b) {
	System.out.println(a>b?a:b);
	}
}
