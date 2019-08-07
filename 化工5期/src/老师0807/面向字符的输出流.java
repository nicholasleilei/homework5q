package 老师0807;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class 面向字符的输出流 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
         Writer w = new FileWriter("d://aa.txt");
         w.write("hello你好\r\n世界");
         w.close();
	}

}
