package ������0713;

public class һ����� {public static void main(String[] args) {
	

	int A=380;
	int B=110;//���Ըĳ�����
	int C=0;
	boolean i = true;
	while(i) {
	int a=(int)(5+Math.random()*(8-5+1));
	int b=(int)(3+Math.random()*(5-3+1));
	System.out.print("Ӣ�۹�������˹�����ʧ");
	System.out.print(a);
	System.out.println("��Ѫ�� ");
	B-=a;if(B<=0){System.out.println("��������,������һ��");C++;
	if(C==1) {B=100;continue;}
	if(C==2) {B=120;continue;}
	if(C==3) {B=130;continue;}
	if(C==4) {B=110;continue;}}
	System.out.print("���﹥��Ӣ�ۣ�Ӣ����ʧ");
	System.out.print(b);
	System.out.println("��Ѫ��");
	A-=b;if(A<=0) {System.out.println("Ӣ����������Ϸ������");break;}	
	}
}
}