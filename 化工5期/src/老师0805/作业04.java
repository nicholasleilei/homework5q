package ��ʦ0805;

public class ��ҵ04 {

	public static void main(String[] args) {
		/*
		 * ͳ��һ���ַ�����С�����ֵĴ���
		 */
		
		String str="�����java��������java�����java�����������java������java���������java���������������";
        String xiao ="java";
        int i=str.indexOf(xiao);
        int count=0;
        while(i!=-1) {
        	count++;
        	str=str.substring(i+xiao.length()-1);
        	i=str.indexOf(xiao);
        }
        System.out.println(count);
	}

}
