package ������0713;

import java.util.Scanner;

public class ���M {
	public static void main(String[] args) {
		int[] arr = new int[5];
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		} // ȫ����ӡ
		for (int j = arr.length - 1; j >= 0; j--) {
			System.out.println(arr[j]);
		} // ȫ����ӡ��������׃������Ȼ��break
		for (int p : arr) {
			System.out.println(p);
		}
		int sum = 0;// ���
		for (int y : arr) {
			sum += y;
		}
		System.out.println(sum);

		for (int o = 0; o < arr.length / 2; o++) {// λ�öԵ�
			int m = arr[o];
			arr[o] = arr[arr.length - 1 - o];
			arr[arr.length - 1 - o] = m;
		}
		for (int p : arr) {
			System.out.println(p);
		}
		int X = arr[0], M = arr[0];
		for (int x = 0; x < arr.length; x++) {// �Ƚ������С
			if (arr[x] > X) {
				X = arr[x];
			}
			if (arr[x] < M) {
				M = arr[x];
			}

		}
		System.out.println(X);
		System.out.println(M);
		for (int i = 0; i < arr.length; i++) {// ð��
			for (int j = 0; j < arr.length - 1 - i; j++) {
				int b = arr[j];
				if (arr[j] > arr[j + 1]) {
					b = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = b;
				}
			}
		}
		for (int p : arr) {
			System.out.println(p);
		}
	}
}
