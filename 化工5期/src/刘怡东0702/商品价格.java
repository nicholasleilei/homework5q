package ������0702;

import java.util.Scanner;

public class ��Ʒ�۸� {
	public static void main(String[] args) {
		boolean a=true;
		int s=59;
		Scanner h=new Scanner(System.in);
	u:	while(a) {
			System.out.println("�����Ʒ�۸�1��100֮��������");
			int b=h.nextInt();
			if(b>s) {System.out.println("�¶���");}
			if(b<s) {System.out.println("������");}
			if(b==s) {
				System.out.println("��ϲ��¶�����Ʒ�۸�");
				break u;
			}else {System.out.println("�´���");}
			
		}
	}

}
