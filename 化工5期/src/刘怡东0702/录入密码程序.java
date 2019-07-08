package 刘怡东0702;

import java.util.Scanner;

public class 录入密码程序 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int mima=852147;int c;
		System.out.println("请输入6位数密码");
		
		for(int i=3;;i--) {p: for(;;) {
		int a=s.nextInt();		
		if(a>=99999) {c=a;
			break p;
		}else System.out.println("请录入6位数字");}
		if(c==mima) {
	    System.out.println("欢迎使用中国银行龙卡");break;}
		else {
		System.out.println("录入错误还有");
		System.out.println(i-1);
		System.out.println("次机会");
		if(i<=1) {System.out.println("吞卡,如忘记密码请求助");break;}}
		
		}
	}

}
