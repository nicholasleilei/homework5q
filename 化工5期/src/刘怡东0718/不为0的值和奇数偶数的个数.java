package ������0718;

public class ��Ϊ0��ֵ������ż���ĸ���{
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
		}System.out.println("ż���ĸ�����"+u);
		System.out.println("�����ĸ�����"+t);
	}
}
