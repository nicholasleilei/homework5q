package 刘怡东0702;

import java.util.Scanner;

public class 最大公约数 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		t: for (int i =65535;; i--) {
			if (a % i == 0 && b % i == 0) {
				System.out.print("这两个数的最大公约数是");
				System.out.println(i);
				break t;
			}
			if (i == 0) {
				System.out.println("这两个数没有最大公约数");
				break t;
			}
		}

	}

}
