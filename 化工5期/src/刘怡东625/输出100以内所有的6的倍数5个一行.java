package ������625;

public class ���100�������е�6�ı���5��һ�� {
	public static void main(String[] args) {
		int i = 1, j = 0;
		for (; i <= 100; i++) {
			if (i % 6 == 0) {
				System.out.print(i+"       ");
				j++;
				if (j % 5 == 0) {
					System.out.print("\n");
				}
			}
		}
	}
}
