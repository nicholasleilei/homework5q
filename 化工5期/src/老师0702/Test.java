package 老师0702;

public class Test {

	public static void main(String[] args) {
		// 8.输出所有水仙花数  abc=a*a*a+b*b*b+c*c*c
		for(int i=100;i<1000;i++) {
			int b=i/100;
			int s=i/10%10;
			int g=i%10;
			if(i==b*b*b+s*s*s+g*g*g) {
				System.out.println(i);
			}
		}

	}

}
