package ��ʦ0807;

import java.util.Arrays;
import java.util.Collections;

public class ��ҵ01 {

	public static void main(String[] args) {
		/* 3.��дһ�����򣬽������һ���ı��еĸ������ʵ���ĸ˳��ת
		�硰To be or not to be�� ��Ϊ ��oT eb ro ton ot eb.��
		3+. �����ַ��� ���ʵ��򣬵����е��ַ��������
		3++.ͳ�ƴ��ַ����й��ж��ٸ�����
		3+++.ͳ�ƴ��ַ����е��ʳ��ֵô���*/
            String str ="To be or not to be";
            String[] strs =str.split(" ");
//            for(String s:strs) {
//            	System.out.print(new StringBuffer(s).reverse()+"  ");
//            }
            
            Collections.reverse(Arrays.asList(strs));
            for(String s:strs) {
            	System.out.print(s+" ");
            }

	}

}
