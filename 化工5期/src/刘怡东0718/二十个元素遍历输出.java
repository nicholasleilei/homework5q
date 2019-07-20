package 刘怡东0718;

public class 二十个元素遍历输出 {
	final static int[] a = { 2, 65, 6, 54, 4, 45, 6, 9, 986, 1, 4, 7, 6, 1, 3, 3, 4, 5, 4, 5 };

	public static void main(String[] args) {
		int i = 0;
		for (int b : a) {
			System.out.print(b+"\t");
			i++;
			if (i % 5 == 0)
				System.out.println();
		}
	}

}
