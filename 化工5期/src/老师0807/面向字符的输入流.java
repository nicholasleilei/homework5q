package 老师0807;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class 面向字符的输入流 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Reader r = new FileReader("d://aa.txt");
		int i = r.read();
		while(i!=-1) {
			System.out.println(i);
			i=r.read();
		}
		
		r.close();
	}

}
