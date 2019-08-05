package 老师0805;

import java.util.HashSet;
import java.util.Set;

public class Set接口 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Set<String> s = new HashSet<>();
         s.add("Z");
         s.add("H");
         s.add("Y");
         s.add(null);
         s.add("A");
         s.add("A");
         System.out.println(s);
         //存入和取出的顺序不一样  set集合是无序的  唯一
         
         //LinkedHashSet  基于链表  有序 唯一
         
         //TreeSet 元素不允许为null
         
         
	}

}
