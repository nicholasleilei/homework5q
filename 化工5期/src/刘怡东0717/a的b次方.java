package 刘怡东0717;

import java.util.Scanner;

public class a的b次方 {
	public static void main(String[] args) {
		ab();
	}
public static void  ab() {
	Scanner s = new Scanner(System.in);
	int a=s.nextInt(),b=s.nextInt(),c=1;
	for(;b>=1;b--) {
		c*=a;
	}System.out.println(c);
}
}
