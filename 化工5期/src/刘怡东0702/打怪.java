package ������0702;

public class ��� {
public static void main(String[] args) {

	int A=330;
	int B=500;
	boolean i=true;
	while(i) {
	int a=(int)(5+Math.random()*(8-5+1));
	int b=(int)(3+Math.random()*(5-3+1));
	System.out.print("Ӣ�۹������������ʧ");
	System.out.print(a);
	System.out.println("��Ѫ��");
	B-=a;if(B<=0){System.out.println("��������,������һ��");B=500;continue;}
	System.out.print("���﹥��Ӣ�ۣ�Ӣ����ʧ");
	System.out.print(b);
	System.out.println("��Ѫ��");
	A-=b;if(A<=0) {System.out.println("Ӣ����������Ϸ������");break;}	
	}
}
}
