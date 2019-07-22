package 刘怡东0713;

import java.util.Scanner;

public class 方法和调用 {
public static void main(String[] args) {	Scanner s= new Scanner(System.in);
	int a=s.nextInt();int b=s.nextInt();
	doMax(a,b);
	doJvxing(a,b);
	System.out.println("较大的数是");
	System.out.println(doMax(a,b));
	System.out.println(doDaxiao(a,b));	
}
public static int doMax(int a,int b) {
	if(a>=b) {
	return 	a;
	}else return b;
}
public static boolean doDaxiao(int a,int b) {
return a==b; 
}
public static void doJvxing(int a,int b) {
	int t=b; 
	for(;a>=1;a--) {	
	for(b=t;b>=1;b--) {
	System.out.print("x");
	}
	System.out.println();
}
}
}//方法定义的（形参）个数或者类型不同但是方法名相同时叫做方法重载