package 刘怡东0718;

import java.util.Scanner;

public class 是否包含给定数字 {
	private final static int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };

	public static void main(String[] args) {
		if (pan()) {
			System.out.println("包含这个数");
		} else
			System.out.println("不含这个数");
	}

	public static boolean pan() {
		Scanner s = new Scanner(System.in);
		int i = s.nextInt();
		boolean n = false;
		for (int b : a) {

			if (i == b) {
				n = true;
			}
		}
		return n;

	}
}
