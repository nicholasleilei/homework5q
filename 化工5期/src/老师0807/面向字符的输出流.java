package ��ʦ0807;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class �����ַ�������� {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
         Writer w = new FileWriter("d://aa.txt");
         w.write("hello���\r\n����");
         w.close();
	}

}
