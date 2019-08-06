package 刘怡东0724;

import java.util.Scanner;

public class 身份证 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("请输入身份证号");
	String id=s.next();
	if(id.charAt(16)%2==0) {
		System.out.println("女");
		
	}else System.out.println("男");
	System.out.println("出生日期"+id.substring(6, 14));
	
	
}
}
