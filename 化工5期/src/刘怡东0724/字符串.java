package ������0724;

import java.util.Scanner;

public class �ַ��� {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String a = s.next();
		char[] chas = a.trim().toCharArray();
		for (int i = 0; i < a.trim().length() / 2; i++) {
			if (chas[i] == chas[chas.length - i - 1]) {
				if (i == chas.length / 2 - 1) {
					System.out.println("����Գ�");
				}
			} else {
				System.out.println("���鲻�Գ�");
				break;
			}
		}

		int d = 0, x = 0, n = 0;
		for (char b : a.toCharArray()) {
			if (b >= 65 && b <= 90) {
				d += 1;
			}
			if (b >= 97 && b <= 122) {
				x += 1;
			}
			if (b >= 48 && b <= 57) {
				n += 1;
			}
		}
		System.out.println("��д��ĸ��" + d + "����" + "Сд��ĸ��" + x + "����" + "������" + n + "��");

		char[] u = a.toCharArray();
		if (u[0] >= 65 && u[0] <= 90) {
			u[0] += 32;
		}
		System.out.println(u);

		
		for(int i=chas.length-1;i>=0;i--) {
			System.out.print(chas[i]);
		}System.out.println();
		
		
		
		
		
		
		
		
		
		int[] arr = { 1, 2, 3 };
		System.out.print("��" + "[");
		for (int b = 0; b < arr.length; b++) {
			System.out.print(arr[b]);
			if (b <= arr.length - 2) {
				System.out.print("��");
			}
		}
		System.out.println("]" + "��");
		System.out.println();
	
	
	
	
	
	
	
	
	}}
