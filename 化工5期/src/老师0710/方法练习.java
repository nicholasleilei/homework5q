package 老师0710;

import java.util.Scanner;

public class 方法练习 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1.自定义方法，键盘录入两个数，返回较大值

		//2.自定义方法，键盘录入两个数，比较是否相等
//		3.定义方法，键盘录入行和列，输出对应行和列的矩形
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入两个数：");
		int a = sc.nextInt();
		int b=sc.nextInt();
		getMax(a, b);
		System.out.println(isEq(a, b));
		printJu(a,b);
	}
	public static void getMax(int a,int b) {
		System.out.println(a>b?a:b);
	}
	public static String isEq(int a,int b) {
		return a==b?"相等":"不等";
	}
    public static void printJu(int a,int b) {
    	
    	for(;a>=1;a--) {
    		for(int j=1;j<=b;j++) {
    			System.out.print("*");
    		}
    		System.out.println();
    	}
    }
}
