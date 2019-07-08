package 刘怡东0702;

public class 买鸡 {
public static void main(String[] args) {
	double muji=3,gji=4,xji=0.5;
	int sum=0;
	 for(int a=0;a<=100;a++) {
		for(int b=0;b<=100;b++) {
			for(int c=0;c<=100;c++) {
				if(3*a+4*b+0.5*c==100&&a+b+c==100) {sum+=1;
				}
				
				
			}
			
		}
	}System.out.print(sum);System.out.println("种可能");
}
}
