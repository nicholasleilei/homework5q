package ������0718;

import java.util.Scanner;

public class �ж�����Ԫ���Ƿ��ظ��Ƿ�Գ� {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int[] a=new int[5];
	for(int i = 0;i<a.length;i++) {
		a[i]=s.nextInt();
	}
	for(int b:a) {
		System.out.println(b);
		}
	p:for(int c=0;c<a.length;c++) {
		for(int d=c+1;d<a.length-1;d++) {
			if(a[c]==a[d]) {
				System.out.println("�������ظ�");
				break p;
			}else {if(d+1==a.length-1) {
				System.out.println("����û���ظ�");
				break p;}}
		}
	}
		for(int e=0;e<a.length;e++) {
			if(a[e]!=a[a.length-e-1]) {
				System.out.println("���鲻�Գ�");
				break;
			}else {
				if(e==a.length-1) {
					System.out.println("����Գ�");
				}
			}
		}
}
}
