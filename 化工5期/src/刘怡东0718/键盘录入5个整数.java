package 刘怡东0718;

import java.util.Scanner;

public class 键盘录入5个整数 {

	public static void main(String[] args) {
		int a[] = new int[5];
		double sum = 0;int j=0;
		Scanner s = new Scanner(System.in);
		for (int n = 0; n < a.length; n++) {
			a[n] = s.nextInt();
		}
		for (int m : a) {
			sum += m;
			System.out.print(m);
		}
		for(int k:a) {
			if(k>sum/a.length) {j++;}
			
		}
		System.out.println();
		System.out.println(sum / a.length);
		System.out.println(j);
	}

	/*public static double ave() {
		int sum = 0;
		for (int n : a) {
			sum += n;
		}
		double v = sum / a.length;
		return v;

	}*/
	
}
