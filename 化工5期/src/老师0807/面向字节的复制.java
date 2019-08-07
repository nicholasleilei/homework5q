package 老师0807;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class 面向字节的复制 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		  InputStream is =new FileInputStream("d://tools//apache-tomcat-8.0.26.exe");
		  OutputStream os = new FileOutputStream("d://abcde.exe");
	       
          int i= is.read();
          while(i!=-1) {
        	  os.write(i);
       	     i=is.read();
          }
          
          os.close();
          is.close();
	}

}
