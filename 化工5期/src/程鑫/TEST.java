package 程鑫;

public class TEST {
public static void main(String[] args) {
	int a=0;
	int sum1=0;
	while(a<=100) {
	sum1=sum1+a;
	a+=3;
	}
	System.out.println("能被三整除的和："+sum1);
	int b=0;
	int sum2=0;
	while(b<=100) {
	sum2=sum2+b;
	b+=4;
	}
	System.out.println("能被四整除的和："+sum2);
	int sum=sum1+sum2;
	System.out.println("总和："+sum);
	
	
	
	
	
	
	
	
}
}
