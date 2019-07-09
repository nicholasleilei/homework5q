package 程鑫0702作业;

import java.util.Scanner;

public class 录入密码 {
	 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("请输入密码：");
	
  a:  for(int i=1;i<=3;i++) {
    	int a= sc.nextInt();
    	if(a>999999||a<100000) {
    	System.out.println("请输入6位有效数字");i--;}
    	if(a==852147)   {
       System.out.println("欢迎你"); break a;  }   
    	 else 
    	System.out.println("密码错误，你还有"+(3-i)+"次机会"); 
    	if (i==3)
    		System.out.println("吞卡");
    }
	}
}
