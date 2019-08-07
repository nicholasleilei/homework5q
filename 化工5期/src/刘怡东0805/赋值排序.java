package 刘怡东0805;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import 刘怡东0805.List练习;
import 刘怡东0805.Runningman;
import 刘怡东0805.Student;
import 刘怡东0805.外部比较器;

public class 赋值排序 {
	private static final ArrayList List练习 = null;

	public static void main(String[] args) {
		Student s = new Student("张", 86.8, 87.4, 54.9);
		Student s1 = new Student("李", 65.7, 75.7, 57.3);
		Student s2 = new Student("刘", 24.9, 56.2, 42.8);
		Student s3 = new Student("王", 35.1, 95.5, 53.7);
		Student s4 = new Student("赵", 62.7, 45.7, 83.3);
		Student s5 = new Student("孙", 62.4, 52.4, 62.2);
		Set<Student> a = new TreeSet<>(new 外部比较器());
		a.add(s);
		a.add(s1);
		a.add(s2);
		a.add(s3);
		a.add(s4);
		a.add(s5);
		for (Student i : a) {
			System.out.println(i);
		} // 因为Stuent中有toString方法，当打印对象时输出值而不是地址

		Runningman r = new Runningman("李晨");
		Runningman r1 = new Runningman("郑凯");
		Runningman r2 = new Runningman("陈赫");
		Runningman r3 = new Runningman("Angelababy");
		Runningman r4 = new Runningman("王祖蓝");
		Runningman r5 = new Runningman("邓超");
		Runningman r6 = new Runningman("鹿晗");
		Runningman r7 = new Runningman("范冰冰");
		Collection<Runningman> b = new ArrayList<>();
		b.add(r);
		b.add(r1);
		b.add(r2);
		b.add(r3);
		b.add(r4);
		b.add(r5);
		b.add(r6);
		if (b.contains(r)) {
			b.add(r7);
		}

		Iterator<Runningman> it = b.iterator();
		while (it.hasNext()) {

			// it.remove();
			System.out.println(it.next());
		}
		
		List<List练习> c=new ArrayList<>();
		
		
	}
}
