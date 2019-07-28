package 程鑫0724作业;

import java.util.Scanner;

public class 邮箱 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
Scanner sc =new Scanner(System.in);
System.out.println("请输入邮箱");

	
for(;;) {
String a=sc.next();
int m=a.indexOf("@");
int n=a.indexOf(".");
 if (m<n && n- m> 1 && n < a.length() - 1) {
	System.out.println("欢迎你");break;
}else {
	System.out.println("邮箱格式错误，请重新输入");
}}
	}

}
