package ��ʦ0808;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ��ҵ01 {

	public static void main(String[] args) throws IOException {
		/*
		 * 1��ʹ��java���봴��һ���ļ���Ҫ���ļ������ļ�·��Ҫ�Ӽ���¼�룬
      ���ж������Ŀ¼�ʹ�������ļ�����ʾ�û��Ƿ񴴽��ɹ���
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�������ļ���·����");
		String path = sc.next();
		System.out.println("�������ļ������ƣ�");
		String filename = sc.next();
		File f = new File(path);
		f.mkdirs();
		if(f.isDirectory()) {
			f=new File(path+"//"+filename);
			if(f.createNewFile())
				System.out.println("�����ɹ�");
		}

	}

}
