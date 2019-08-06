package 老师0805;

import java.util.Arrays;

public class 作业01 {

	public static void main(String[] args) {
		//有一个字符串“91_27_46_38_50”??
		//  输出结果“27 38 46 50 91”

		
		String str ="91_27_46_38_50";
		
       String[] strs = str.split("_");
       
       Arrays.sort(strs);
       for(String s:strs) {
    	   System.out.print(s+"  ");
       }
	}

}
