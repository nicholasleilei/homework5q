package 付恒鑫0702;

public class 存钱 {

	public static void main(String[] args) {
		// 小芳存钱，小芳的妈妈每天给他2.5元钱，她都会存起来，但是每当这一天是5或者5的倍数的时候，
//	    	 他都会花去6元钱，请问经过多少天，小芳才可以存到100元钱

		int x=1;
		for(double i=0;i<=100;i+=2.5) {
			x++;
			if(x%5==0) {
				i=i-6;
			}if(i==100) {
			
			}
			}
		System.out.println(x+"天");
		}
	}


