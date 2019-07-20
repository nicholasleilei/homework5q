package 刘怡东0718;

public class 不为0的值和奇数偶数的个数{
	static int[] a = { 1, 3, 4, 5, 0, 0, 6, 6, 0, 5, 4, 7, 6, 7, 0, 5 };

	public static void main(String[] args) {
		int i = 0;
		for (int j : a) {
			if (j != 0) {
				i++;
			}
		}
		int[] b = new int[i];
		int y = 0;int u=0,t=0;
		for (int m = 0; m < a.length; m++) {
			if (a[m] != 0) {
				b[y] = a[m];
				y++;
			}
			if(a[m]%2==0)u++;else t++;
		}
		for (int B : b) {
			System.out.println(B);
		}System.out.println("偶数的个数是"+u);
		System.out.println("奇数的个数是"+t);
	}
}
