package 老师0806;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class List练习01 {

	public static void main(String[] args) {
		/*
		 * 1.有一个集合存字符串，李晨、邓超、王祖蓝、鹿晗、Anglababy、陈赫、郑凯
                                     判断其中有没有李晨，如果有，添加一个范冰冰
                                      要求：（1）选择一种你喜欢的遍历方式
                               （2）使用Iterator迭代器试试有没有问题
		 */
          List<String> names = new ArrayList<>();
          names.add("李晨");
          names.add("鄧超");
          names.add("王祖藍");
          names.add("鹿晗");
          names.add("陳赫");
          if(names.contains("李晨"))
        	  names.add("范冰冰");
          
          for(String n:names) {
        	  System.out.println(n);
          }
          
		
		/*
		 * for(String n:names) { if(n.equals("李晨")) names.add("范冰冰"); } for(String
		 * n:names) { System.out.println(n); }
		 */
		
		/*
		 * ListIterator<String> it = names.listIterator(); while(it.hasNext()) {
		 * if(it.next().equals("李晨")) names.add("范冰冰"); System.out.println(it.next()); }
		 */
         
          
	}

}
