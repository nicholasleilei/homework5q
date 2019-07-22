package Áõâù¶«0717;

public class Ñ¡ÔñÅÅĞò·¨ {
	public static void main(String[] args) {
		int[] a = { 6, 5, 70,3, 534 };

		for (int i = 0; i < a.length - 1; i++) {
			int x = i;
			for (int j = x + 1; j < a.length; j++) {
				if (a[x] > a[j]) {
					x = j;
				}
			}
			if (x != i) {
				int t = a[i];
				a[i] = a[x];
				a[x] = t;
			}

			for (int l : a) {
				System.out.print(l + " ");
			}
		}
	}
}
