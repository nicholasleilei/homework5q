package ��ʦ0807;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class �����ֽڵ������� {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
          InputStream is =new FileInputStream("d://aa.txt");
           int i= is.read();
           while(i!=-1) {
        	   System.out.println(i);
        	   i=is.read();
           }
           
           is.close();
	}

}
