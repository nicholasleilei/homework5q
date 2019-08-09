package 程鑫0808作业;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class 用户注册 {

	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
File u=new File("d://user");
String q="d://user";
u.mkdirs();
Scanner sc=new Scanner(System.in);
System.out.println("请输入登录账号");
System.out.println("请输入密码");
int z=sc.nextInt();
String m=sc.next();
File w=new File(q+"//"+z+"//");
File e=new File(q+"//"+z+"//"+m);
if(w.exists()) {
	if(e.exists())
	System.out.println("登录成功");
	else
		System.out.println("密码错误");
}
else {
	System.out.println("未检测到有此账号，请注册");
System.out.println("请注册账号：");
System.out.println("请设置密码");	
		int a=sc.nextInt();
		  String b=sc.next();
	u=new File(q+"//"+a+"//");
		u.mkdirs();
u=new File(q+"//"+a+"//"+b);
	if(u.createNewFile())
		System.out.println("创建成功");
	else
		System.out.println("此账号已经被注册");
	}
	}
}
