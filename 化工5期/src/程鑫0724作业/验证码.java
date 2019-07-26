package 程鑫0724作业;

import java.util.Random;
import java.util.Scanner;

public class 验证码 {
public static void main(String[] args) {
	Random r=new Random();
	int a=(char)(int)(Math.random()*26+65);
	int b=(char)(int)(Math.random()*26+97);
	int i0=(r.nextInt(62));
	int i1=(r.nextInt(62));
	int i2=(r.nextInt(62));
	int i3=(r.nextInt(62));
    char[]arr= {'0','2','3','4','5','6','7','8','9','a','b','c','d','e',
    'f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u',
    'v','w','x','y','z','A','B','C','D','E','F','G','H','I','J','K','L',
    'M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
   	System.out.println(arr[i0]+""+arr[i1]+""+arr[i2]+""+arr[i3]);
   		System.out.println("请输入验证码");
      Scanner sc=new Scanner(System.in);
      String q=sc.next();
      String w=sc.next();
      String e=sc.next();
      String t=sc.next();
    if(q.equals(arr[i0])&&w.equals(arr[i1])&&e.equals(arr[i2])&&t.equals(arr[i3]));
    {System.out.println("输入正确");}
}
}

