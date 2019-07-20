package 刘怡东0718;

public class 数组的和平均数最大值 {
	private final static int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };

	public static void main(String[] args) {
		System.out.println(sum());
		System.out.println(ave());
		System.out.println(max());
	}

	public static int sum() {
		int s = 0;
		for (int c : a) {
			s += c;
		}
		return s;
	}

	public static double ave() {
		double v = 0;
		for (int c : a) {
			v += c;
		}
		return v / a.length;
	}

	public static int max() {
		int m = a[0];
		for (int i : a) {
			if (i > m)
				m = i;
		}
		return m;

	}

}
