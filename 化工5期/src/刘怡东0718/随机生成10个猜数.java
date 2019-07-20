package 刘怡东0718;

import java.util.Scanner;

public class 随机生成10个猜数 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int l=s.nextInt();
		int max = 1, min = 100;
		int[] a = new int[10];
		for (int b=0 ;b<a.length;b++) {
			a[b] = (int) (1 + Math.random() * (100 - 1 + 1));
		}
		for(int A:a) {System.out.println(A);}
		for (int k=0;k<a.length;k++) {
			if (a[k] > max) {
				max = a[k];
			}
			;
			if (a[k]< min) {
				min = a[k];
			}
		}
		for (int j=0;j<a.length;j++) {
			if(l==a[j]) {System.out.println("存在");
				break;
			}
			if(l!=a[j]&&j==9) {
				System.out.println("不存在");
			}
		}
		System.out.println(max);
		System.out.println(min);
	}
}
