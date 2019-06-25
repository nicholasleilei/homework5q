package 老师0625;

import java.util.Scanner;

public class SwitchTest01 {

	public static void main(String[] args) {
		// 键盘录入一个数，根据这个数输出对应的星期
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个数：");
		int n = sc.nextInt();
		switch (n) {
		case 1:
		case 8:
			System.out.println("星期一");
			break;
		case 2:
			System.out.println("星期二");
			break;
		case 3:
			System.out.println("星期三");
			break;
		case 4:
			System.out.println("星期四");
			break;
		case 5:
			System.out.println("星期五");
			break;
		case 6:
			System.out.println("星期六");
			break;
		case 7:
			System.out.println("星期日");
			break;

		default:
			System.out.println("录入错误");
			break;
		}
	}

}
