package 付恒鑫0726;

import java.util.Scanner;

public class 检验qq号码 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		。校验QQ号码，要求：1.必须是5-15位数字  2.不能以0开头
//		如果复合要求输出登录成功 否则给出相应的提示
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入你的QQ号");
		String qq=sc.next();
		 boolean f =true;
		if(qq.length()<5||qq.length()>15) {
			f=false;
			System.out.println("qq号码的长度应该为5-15之间");
		}
		if(qq.startsWith("0")) {
			f=false;
			System.out.println("不能以0开头");
		}
		
		if(f) {
			System.out.println("登录成功");
		}else {
			System.out.println("登录失败");
		}

	}

	}


