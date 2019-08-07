package 老师0807;

import java.util.Arrays;
import java.util.Collections;

public class 作业01 {

	public static void main(String[] args) {
		/* 3.编写一个程序，将下面的一段文本中的各个单词的字母顺序反转
		如“To be or not to be” 变为 “oT eb ro ton ot eb.”
		3+. 将此字符串 单词倒序，单词中的字符正序输出
		3++.统计此字符串中共有多少个单词
		3+++.统计此字符串中单词出现得次数*/
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
