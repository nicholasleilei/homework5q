package 付恒鑫0702;

public class 大吉大利吃鸡 {

	public static void main(String[] args) {
		// 每只母鸡3元钱，每只公鸡5元钱，三只一块钱，如果花100元买100只鸡有哪些可能
		int sum=0;
		double x=3.0,y=5.0,z=1/3;
		for(int i=1;i<=100;i++) {
			for(int j=1;j<=100;j++) {
				for(int n=1;n<=100;n++) {
					if(3*i+5*j+1/3*n==100&&i+j+n==100) {sum++;
						System.out.println(i+"只母鸡"+j+"只公鸡"+n+"只小鸡");
						break;
					}
					
				}
			}
		}
		System.out.println(sum+"种可能");	
	}

}
