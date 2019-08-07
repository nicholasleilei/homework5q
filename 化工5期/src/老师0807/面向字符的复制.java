package 老师0807;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class 面向字符的复制 {
	public static void main(String[] args) throws IOException {
      
		Reader r = new FileReader("d://tools//apache-tomcat-8.0.26.exe");
		Writer w = new FileWriter("d://cc.exe");
		int i=r.read();
		while(i!=-1) {
			w.write(i);
			i=r.read();
		}
		r.close();
		w.close();
	}
}
