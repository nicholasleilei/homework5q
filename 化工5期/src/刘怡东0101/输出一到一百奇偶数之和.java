package 刘怡东0101;

public class 输出一到一百奇偶数之和 {
	public static void main(String[] args) {

		int i = 1;
		int a = 0, b = 0;
		while (i <= 100) {
			if (i% 2 == 0) {
				b += i;
			} else {
				a += i;
			}
			i++;
		}
		System.out.println(a + "是奇数之和");
		System.out.println(b + "是偶数之和");
	}

}
