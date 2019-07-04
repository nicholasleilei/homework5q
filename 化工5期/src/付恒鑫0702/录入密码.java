package 付恒鑫0702;

import java.util.Scanner;

public class 录入密码 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
