package ������0718;

import java.util.Scanner;

public class ͼƬ����չ�� {
public static void main(String[] args) {
	String[] a= {"BMP","GIF","JPG","PNG"};
	Scanner s=new Scanner(System.in);
	System.out.println("������ͼƬ����չ������д��");
	String b=s.next();
	/*for(int j=0;j<a.length;j++) {
		if(a[j]!=b&&j==a.length-1){
			System.out.println("��������ȷ����չ��");
			break;
	}else {
		if(a[j]==b) {
			System.out.println("�����ϴ�");}
		}}*/
	for(String l:a) {if(l.contentEquals(b)) {System.out.println("1");break;}
	else{continue;}}
}
}
