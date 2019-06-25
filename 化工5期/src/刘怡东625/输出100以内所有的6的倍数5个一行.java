package 刘怡东625;

public class 输出100以内所有的6的倍数5个一行 {
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
