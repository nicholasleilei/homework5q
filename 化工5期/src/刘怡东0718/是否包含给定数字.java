package ������0718;

import java.util.Scanner;

public class �Ƿ������������ {
	private final static int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };

	public static void main(String[] args) {
		if (pan()) {
			System.out.println("���������");
		} else
			System.out.println("���������");
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
