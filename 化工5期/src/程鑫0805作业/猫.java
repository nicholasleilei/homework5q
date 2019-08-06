package 程鑫0805作业;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class 猫 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Collection<String> cat=new ArrayList<>();
		cat.add("白猫");
		cat.add("黑猫");
		cat.add("花猫");
		for(String st:cat) {
			System.out.print(st+" ");
		}
		System.out.println();
		 Iterator<String> it = cat.iterator();
		 while(it.hasNext()) {
		 System.out.println(it.next());}
	}

}
