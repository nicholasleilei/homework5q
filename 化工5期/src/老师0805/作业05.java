package ��ʦ0805;

public class ��ҵ05 {

	public static void main(String[] args) {
		/*
		 * ����һ���ַ�����������з����ָ�����ʾ������Ǵ�������ת����double����
		 */
		String str ="sdklskdla2131";
		boolean  f = true;
         for(int i=0;i<str.length();i++) {
        	 if(Character.isDigit(str.charAt(i))) {
        		 System.out.println(Double.parseDouble(str.charAt(i)+""));
        	 }else {
        		f=false;
        	 }
        		 
         }
         if(!f)
        	 System.out.println("���з�����");
	}

}
