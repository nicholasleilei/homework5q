package 老师0808;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class 作业01 {

	public static void main(String[] args) throws IOException {
		/*
		 * 1、使用java代码创建一个文件，要求文件名及文件路径要从键盘录入，
      并判断如果是目录就创建这个文件，提示用户是否创建成功。
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入文件的路径：");
		String path = sc.next();
		System.out.println("请输入文件的名称：");
		String filename = sc.next();
		File f = new File(path);
		f.mkdirs();
		if(f.isDirectory()) {
			f=new File(path+"//"+filename);
			if(f.createNewFile())
				System.out.println("创建成功");
		}

	}

}
