package ������0713;

import java.util.Scanner;

public class ¼���������� {
	public static void main(String[] args) {
		bijiao();
		bijiao1();

	}

	public static double bijiao() {
		Scanner s = new Scanner(System.in);
		double a = s.nextDouble(), b = s.nextDouble();
		if (a > b) {
			return a;
		} else
			return b;
	}

	public static void bijiao1() {
		Scanner s = new Scanner(System.in);
		double a = s.nextDouble(), b = s.nextDouble();
		if (a == b) {
			System.out.println("�����������");
		}
	}
}
