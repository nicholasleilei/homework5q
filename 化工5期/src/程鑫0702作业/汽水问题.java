package ����0702��ҵ;

public class ��ˮ���� {
public static void main(String[] args) {
	int p=0;int sum=0;
	for(int i=1000;i>0;i--) {
		p+=1;
		if(p%3==0) {
		i+=1;p-=3;}
	  sum++;
		}
	System.out.println(sum);
	System.out.println(p);
	
}
}
