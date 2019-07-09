package 程鑫0702作业;

import java.util.Scanner;

//猜商品价格，在1－100之间的整数，用户从键盘不断猜，根据系统高低提示，直到猜中商品价格为止
public class 猜商品价格 {
public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	System.out.println("猜吧1~100");
	int m=50;
	int a=sc.nextInt();
	if (a==m)
		System.out.println("猜对了");
	else if(a>m&&a<100)
	  System.out.println("高");
	else  if(a>0&&a<m)
	  System.out.println("低");
	else 
	  System.out.println("价格在1~100之间哦");
}
}
