package 刘怡东0702;

public class 猴子 {
	public static void main(String[] args) {
		for (int i = 65535;; i--) {
			int c = i;
			for (int t = 10; t >= 1; t--) {
				c = c / 2 - 1;
			}
			if (c == 1) {
				System.out.println(i+"个桃子");break;
			}

	}
}
}
