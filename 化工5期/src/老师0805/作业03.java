package ��ʦ0805;

import java.util.Arrays;
import java.util.Scanner;

public class ��ҵ03 {

	public static void main(String[] args) {
		//����¼��5��ˮ����Ӣ�ģ����ֵ�˳��������ʾ����
		Scanner sc = new Scanner(System.in);
		String[] fs = new String[5];
		for(int i=0;i<5;i++) {
			System.out.println("������ˮ��");
		    String f = sc.next();
			fs[i]=f;
		}
		Arrays.sort(fs);
		for(String s:fs) {
			System.out.print(s+" ");
		}
	}

}
