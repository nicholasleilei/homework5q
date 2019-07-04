package 刘怡东0702;

import java.util.Scanner;

public class a的b次方 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int a=s.nextInt(),b=s.nextInt(),c=a;
	for(;b>1;b--) {
		c*=a;
	}System.out.println(c);
}
}
