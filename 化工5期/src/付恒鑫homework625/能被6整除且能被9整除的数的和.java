package 付恒鑫homework625;

public class 能被6整除且能被9整除的数的和 {

	public static void main(String[] args) {
		// 能被6整除且能被9整除的数的和
		int i=1;
		int sum=0;
		while(i<100) {
			i++;
			if(i%6==0&&i%9==0);{
				sum+=i;
			}
		}System.out.println(sum);

	}

}
