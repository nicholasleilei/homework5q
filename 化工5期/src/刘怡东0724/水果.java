package 刘怡东0724;

import java.util.Scanner;

public class 水果 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("请输入五个水果英文名字");
	String s0=s.next().concat(" ");
	String s1=s.next().concat(" ");
	String s2=s.next().concat(" ");
	String s3=s.next().concat(" ");
	String s4=s.next().concat(" ");
	String[] a= {s0,s1,s2,s3,s4};
	bijiao(a);
	System.out.println(a);
	
	
}
public static void bijiao(String[] s) {
	 for(int i=0;i<s.length-1;i++){
 	    for(int j=0;j<s.length-1-i;j++){
 	        if(s[j].compareToIgnoreCase(s[j+1])>0){
 	            String t=s[j];
 	            s[j]=s[j+1];
 	            s[j+1]=t;
 	        }
 	   }}
	
}
}
