package 老师0809;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class 作业037号 {

	public static void main(String[] args) throws IOException {
		//1011、从该文件中读取号码，随机取出一个号码，作为中奖号码，显示出来。并将该号码打印到中奖号码文件中   
		BufferedReader br=new BufferedReader(new FileReader("d://aa.txt"));
		List<String> nums = new ArrayList<>();
		String n = br.readLine();
		while(n!=null &&!"".equals(n)) {
			nums.add(n);
			n = br.readLine();
		}
		br.close();
		int i=(int)(Math.random()*(nums.size()-1));//0~length-1
		System.out.println("中奖的号码是："+nums.get(i));
		
	}

}
