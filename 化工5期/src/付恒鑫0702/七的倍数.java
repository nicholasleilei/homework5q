package 付恒鑫0702;

public class 七的倍数 {

	public static void main(String[] args) {
		// 1至50中是7的倍数的数值之和
		int sum=0;
		for(int i=1;i<=50;i++) {
			if(i%7==0) {
				sum+=i;
			}
		}System.out.println(sum);

	}

}
