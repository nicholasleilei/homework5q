package 老师0809;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class 作业027號 {

	public static void main(String[] args) throws IOException {
		//1010、将手机号码录入文件中，直到录入完成结束。
		//（要求：使用正则表达式，验证通过则可以存入文件）


		BufferedWriter bos=new BufferedWriter(new FileWriter("d://aa.txt"));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入手機號碼：");
		String nums = sc.next();
		while(!nums.equals("完成")) {
			bos.write(nums);
			bos.newLine();
			nums = sc.next();
		}
		bos.close();
		
	}

}
