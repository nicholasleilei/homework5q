package ����0805��ҵ;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class è {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Collection<String> cat=new ArrayList<>();
		cat.add("��è");
		cat.add("��è");
		cat.add("��è");
		for(String st:cat) {
			System.out.print(st+" ");
		}
		System.out.println();
		 Iterator<String> it = cat.iterator();
		 while(it.hasNext()) {
		 System.out.println(it.next());}
	}

}
