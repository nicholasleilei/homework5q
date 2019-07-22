package 刘怡东0713;

public class 输出数组中所有6的倍数 {
	final static int[] a = { 1, 2, 3, 4, 5, 6, 6, 6, 12, 7, 54 };

	public static void main(String[] args) {
		int s = 0;
		for (int b : a) {
			if (b % 6 == 0) {
				s += 1;
				System.out.print(b + " ");
			}
		}
		System.out.println();
		System.out.println(s);

	}

}
