package ��ʦ0806;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class List��ϰ01 {

	public static void main(String[] args) {
		/*
		 * 1.��һ�����ϴ��ַ���������˳�����������¹�ϡ�Anglababy���ºա�֣��
                                     �ж�������û���������У����һ��������
                                      Ҫ�󣺣�1��ѡ��һ����ϲ���ı�����ʽ
                               ��2��ʹ��Iterator������������û������
		 */
          List<String> names = new ArrayList<>();
          names.add("�");
          names.add("����");
          names.add("�����{");
          names.add("¹��");
          names.add("ꐺ�");
          if(names.contains("�"))
        	  names.add("������");
          
          for(String n:names) {
        	  System.out.println(n);
          }
          
		
		/*
		 * for(String n:names) { if(n.equals("�")) names.add("������"); } for(String
		 * n:names) { System.out.println(n); }
		 */
		
		/*
		 * ListIterator<String> it = names.listIterator(); while(it.hasNext()) {
		 * if(it.next().equals("�")) names.add("������"); System.out.println(it.next()); }
		 */
         
          
	}

}
