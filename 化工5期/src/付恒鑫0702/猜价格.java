package 付恒鑫0702;

import java.util.Scanner;

public class 猜价格 {

	public static void main(String[] args) {
		// 猜商品价格，在1－100之间的整数，用户从键盘不断猜，根据系统高低提示，直到猜中商品价格为止
	r:	for(int i=1;i<100;i++) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("请猜出你心的的那个数");
		int x=sc.nextInt();
		if(x==50) {
			System.out.println("恭喜你，猜中了");
			break r;
			}else if(x<50) {
				System.out.println("小");
		}   if(x>50) {
			System.out.println("大");
			
				
			}
		}
		}
	}


