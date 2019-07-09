package 老师0702;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		 /*
		 * 10.键盘录入QQ号和密码进行登录，如果QQ是349417084并且密码是123456， 提示欢迎你，
		 * 否则提示对不起输入错误，请你重新输入，
		 * 如果三次输入都不正确，提示QQ号已经被锁
		 */
       Scanner sc = new Scanner(System.in);
       
      for(int i=1;i<=3;i++) {
   
       System.out.println("请输入密码：");
       String pass= sc.next();
       
       if(qq.equals("666")&&pass.equals("666")) {
    	   System.out.println("欢迎你！");
    	   break;
       }else {
    	   System.out.println("输入错误，请重新输入！");
       }
       if(i==3) {
    	   System.out.println("已锁");
       }
      }
	}

}
