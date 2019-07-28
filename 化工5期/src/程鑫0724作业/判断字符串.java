package 程鑫0724作业;

import java.util.Scanner;
public class 判断字符串 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
Scanner sc=new Scanner(System.in);
String m=sc.next();
char[]arr=m.toCharArray();
for(int i=0;i<m.trim().length()/2;i++) {
	int j=arr.length-i-1;
	  char o=arr[i];
	  char p=arr[j];
	if(o==p) {
		if(i==arr.length/2-1) {
		System.out.println("对称");}
	}
else {
	System.out.println("不对称");
}
	}

}}
