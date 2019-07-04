package ¸¶ºãöÎ0702;

public class Çó½×³Ë {

	public static void main(String[] args) {
		// ¼ÆËã1£¡+2£¡+3£¡+4£¡+...9!
//		Çó9£¡
//		int sum=0;
//		for(int i=1;i<=9;i++) {
//			for(int j=1,x=1;j<=i;j++) {
//				x=j*x;
//				sum+=x;
//			}
//		}
//		System.out.println(sum);
		int sum=0;
		for(int i=1;i<=9;i+=2) {
			for(int j=1,x=1;j<=i;j++) {
				x=j*i;
				sum+=x;
			}
		}
			System.out.println(sum);
	}

}
