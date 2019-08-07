package 老师0807;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class 带缓冲区的字节流 {
	public static void main(String[] args) throws IOException {
		
		long t1= System.currentTimeMillis();
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("d://tools//apache-tomcat-8.0.26.exe"));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("d://zz.exe"));
		
		int i=bis.read();
		while(i!=-1) {
			bos.write(i);
			i=bis.read();
		}
		
		bis.close();
		bos.close();
		
		long t2 = System.currentTimeMillis();
		System.out.println(t2-t1);
	}
}
