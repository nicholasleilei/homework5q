package ��ʦ0809;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ��ҵ027̖ {

	public static void main(String[] args) throws IOException {
		//1010�����ֻ�����¼���ļ��У�ֱ��¼����ɽ�����
		//��Ҫ��ʹ��������ʽ����֤ͨ������Դ����ļ���


		BufferedWriter bos=new BufferedWriter(new FileWriter("d://aa.txt"));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ոݔ���֙C̖�a��");
		String nums = sc.next();
		while(!nums.equals("���")) {
			bos.write(nums);
			bos.newLine();
			nums = sc.next();
		}
		bos.close();
		
	}

}
