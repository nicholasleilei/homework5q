package ��ʦ0806;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class List��ϰ02 {

	public static void main(String[] args) {
		// //2.ȥ��List�����е��ظ�ֵ
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("AB");
		list.add("A");
		list.add("A");
		list.add("A");
       System.out.println(list);
       
       Set<String> set = new HashSet<>(list);
       System.out.println(set);
	}

}
