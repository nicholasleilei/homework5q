package 老师0807;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class 面向字节的输出流 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        OutputStream os = new FileOutputStream("d://aa.txt");
        os.write(1);
        os.close();
	}

}
