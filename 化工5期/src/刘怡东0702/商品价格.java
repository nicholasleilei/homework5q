package 刘怡东0702;

import java.util.Scanner;

public class 商品价格 {
	public static void main(String[] args) {
		boolean a=true;
		int s=59;
		Scanner h=new Scanner(System.in);
	u:	while(a) {
			System.out.println("请猜商品价格（1到100之间整数）");
			int b=h.nextInt();
			if(b>s) {System.out.println("猜多了");}
			if(b<s) {System.out.println("猜少了");}
			if(b==s) {
				System.out.println("恭喜你猜对了商品价格");
				break u;
			}else {System.out.println("猜错了");}
			
		}
	}

}
