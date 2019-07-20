package 刘怡东0718;

import java.util.Scanner;

public class 五个元素的型数组a初始化逆序 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int[] a=new int[5];
	for(int i = 0;i<a.length;i++) {
		a[i]=s.nextInt();
	}
	for(int b:a) {
		System.out.println(b);
		}
	for(int i=0,b;i<a.length/2;i++) {
		b=a[a.length-1-i];
		a[a.length-1-i]=a[i];
		a[i]=b;
	}
	for(int c=0;c<a.length;c++){System.out.println(a[c]);}
}
}
