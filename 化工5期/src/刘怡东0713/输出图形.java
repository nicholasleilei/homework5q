package Áõâù¶«0713;

import java.util.Scanner;

public class Êä³öÍ¼ÐÎ {
	public static void main(String[] args) {
		jvxxing();changfabiao();
	}

	public static void jvxxing() {
		Scanner s = new Scanner(System.in);
		int i = s.nextInt(), j = s.nextInt(),n=j;
		for (; i > 0; i--) {
			for (; j > 0; j--) {
				System.out.print("x");

			}
			System.out.println();j=n;
		}

	}
	public static void changfabiao() {
		Scanner s = new Scanner(System.in);
		int i = s.nextInt();
		for(;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(i+"x"+j+"=");
				System.out.print(j*i+" ");
			}System.out.println();
		}
	}
}
