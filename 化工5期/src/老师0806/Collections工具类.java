package 老师0806;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collections工具类 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(17);
		list.add(70);
		list.add(30);
		list.add(90);
		list.add(14);
		System.out.println(list);
         Collections.sort(list);
         Collections.reverse(list);
         Collections.shuffle(list);
         System.out.println(list);
	}

}
