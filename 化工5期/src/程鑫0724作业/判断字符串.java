package ����0724��ҵ;

import java.util.Scanner;
public class �ж��ַ��� {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
Scanner sc=new Scanner(System.in);
String m=sc.next();
char[]arr=m.toCharArray();
for(int i=0;i<m.trim().length()/2;i++) {
	int j=arr.length-i-1;
	  char o=arr[i];
	  char p=arr[j];
	if(o==p) {
		if(i==arr.length/2-1) {
		System.out.println("�Գ�");}
	}
else {
	System.out.println("���Գ�");
}
	}

}}
