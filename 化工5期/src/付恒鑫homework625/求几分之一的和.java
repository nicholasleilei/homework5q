package 付恒鑫homework625;

public class 求几分之一的和 {

	public static void main(String[] args) {
		// 求1/2+1/3+1/4+1/5……1/10  的和。
		double i=2;
		double sum=0;
		while(i<=10){
			double x=1/i;
			sum+=x;
			i++;
		}
			System.out.println(sum);
			}

}
