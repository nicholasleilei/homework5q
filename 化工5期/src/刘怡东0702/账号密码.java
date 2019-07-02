package Áõâù¶«0702;

import java.util.Scanner;

public class ÕËºÅÃÜÂë {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String MIMA="1234";
	String NAME="lyd";
	boolean a=true;int  i=0;
while(a){
	System.out.println("ÓÃ»§Ãû");String name=sc.next();
	System.out.println("ÃÜÂë");String mima=sc.next();
		if(name.equals(NAME)&&mima.equals(MIMA)) {
			System.out.println("»¶Ó­Äú");break;
		}else {i++;
			System.out.println("ÊäÈë´íÎó");}
	if(i==3) {
		System.out.println("µ¯³ö,ºÅÂë±»Ëø");break;
	}
}}
}
