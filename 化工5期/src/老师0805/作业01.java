package ��ʦ0805;

import java.util.Arrays;

public class ��ҵ01 {

	public static void main(String[] args) {
		//��һ���ַ�����91_27_46_38_50��??
		//  ��������27 38 46 50 91��

		
		String str ="91_27_46_38_50";
		
       String[] strs = str.split("_");
       
       Arrays.sort(strs);
       for(String s:strs) {
    	   System.out.print(s+"  ");
       }
	}

}
