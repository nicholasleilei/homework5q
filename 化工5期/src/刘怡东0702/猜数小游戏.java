package 刘怡东0702;

import java.util.Scanner;

public class 猜数小游戏 {
public static void main(String[] args) {
	int a= (int)(0+Math.random()*(99-0+1));
	Scanner s= new Scanner(System.in);
	
	for(int i =1;;i++) {int b=s.nextInt();
		if(b>a) {System.out.println("太大");continue;}
		if(b<a) {System.out.println("太小");continue;}
		if(b==a) {System.out.print("猜对了！");
		 if(i==1) {System.out.println("你太聪明了！");}
		 if(i<=5&&i>=2) {System.out.println("不错，好样的！");}
		 if(i>=5) {System.out.println("笨蛋！");}
		break;}
	}
}
}
