package ������0718;

public class ������������xy��2������������Ԫ����ϳ�����һ������z��� {
public static void main(String[] args) {
	int[] a= {1,2,3,4,5};
	int[] b= {6,7,8,9,0};
	int c=a.length,d=b.length;
	int[] e=new int[c+d];
	for(int i=0;i<e.length-b.length;i++) {
		e[i]=a[i];
		
	}
	for(int j=0;j<b.length;j++) {
		e[a.length+j]=b[j];
	}
	for(int p:e) {
		System.out.println(p);
	}
}
}
