package ��ʦ0809;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ��ҵ037�� {

	public static void main(String[] args) throws IOException {
		//1011���Ӹ��ļ��ж�ȡ���룬���ȡ��һ�����룬��Ϊ�н����룬��ʾ�����������ú����ӡ���н������ļ���   
		BufferedReader br=new BufferedReader(new FileReader("d://aa.txt"));
		List<String> nums = new ArrayList<>();
		String n = br.readLine();
		while(n!=null &&!"".equals(n)) {
			nums.add(n);
			n = br.readLine();
		}
		br.close();
		int i=(int)(Math.random()*(nums.size()-1));//0~length-1
		System.out.println("�н��ĺ����ǣ�"+nums.get(i));
		
	}

}
