package 老师0805;

import java.util.Arrays;
import java.util.Scanner;

public class 作业03 {

	public static void main(String[] args) {
		//键盘录入5中水果的英文，按字典顺序将他们显示出来
		Scanner sc = new Scanner(System.in);
		String[] fs = new String[5];
		for(int i=0;i<5;i++) {
			System.out.println("请输入水果");
		    String f = sc.next();
			fs[i]=f;
		}
		Arrays.sort(fs);
		for(String s:fs) {
			System.out.print(s+" ");
		}
	}

}
