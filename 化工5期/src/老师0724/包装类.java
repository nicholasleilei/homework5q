package ��ʦ0724;

import java.io.CharConversionException;

public class ��װ�� {
public static void main(String[] args) {
	int i=10;
	Integer ii = 20; //����ת��   //�Զ�װ��
	
    int a = ii;//����ת�͵�ʱ��Ĭ�ϵ�   --�Զ�����
	System.out.println(Integer.valueOf("123"));//�����������ת��Integer��
	System.out.println(Integer.parseInt("333"));
	
	System.out.println(Double.parseDouble("2222"));
	System.out.println(Double.valueOf("222233"));
	
	
	System.out.println(Character.isDigit('r'));
	System.out.println(Character.isLetter('a'));
	System.out.println(Character.isUpperCase('a'));
	System.out.println(Character.isLowerCase('a'));
	System.out.println(Character.isSpace('a'));
}
}
