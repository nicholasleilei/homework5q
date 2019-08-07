package 老师0807;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class 带缓冲区的字符流 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        BufferedReader br=new BufferedReader(new FileReader("d://aa.txt"));
        BufferedWriter bw=new BufferedWriter(new FileWriter("d://dd.txt"));
        
        String l = br.readLine();
        while(!"".equals(l)&&l!=null) {
        	bw.write(l);
        	bw.newLine();
        	l = br.readLine();
        }
        
        br.close();
        bw.close();
	}

}
