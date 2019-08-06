package 付恒鑫0702;

import java.util.Scanner;

public class 录入密码 {

	public static void main(String[] args) {
		/*
		 * .完成录入密码程序。 现有密码852147,可通过键盘录入， 要求如果三次之内录入正确，提示欢迎使用中国银行龙卡。 如果当入错误三次以上，则提示吞卡
		 * 每录错1次，提示用户还有几次机会。 用户录入的密码必须是6位数字， 才算录入1次， 否则提示请录入6位数字
		 */

//		if(pass<=99999) {
//			System.out.println("请输入6位数字");
		for(int i=1;i<=3;i++) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入密码");
		String pass=sc.next();
		if(pass.equals("852147")) {
			System.out.println("欢迎使用中国银行龙卡");
			break;
			
		}else if(i==1) {
			System.out.println("输入错误，你还有两次机会");
		}
		else if(i==2) {
			System.out.println("输入错误，你还有一次机会");
		}else {
			System.out.println("你已被吞卡");
		}
		}
		
	}
	}

