package 程鑫0702作业;

public class 一三五七九的阶乘 {
public static void main(String[] args) {
	int sum=0;int b=1;
	for  (int c=9;c>=0;c-=2) {
		for(int i=1;i<=c;i++) {
		b*=i;
		sum+=b;
		
	}
}System.out.println(sum);
}
}