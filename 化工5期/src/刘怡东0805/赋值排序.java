package ������0805;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import ������0805.List��ϰ;
import ������0805.Runningman;
import ������0805.Student;
import ������0805.�ⲿ�Ƚ���;

public class ��ֵ���� {
	private static final ArrayList List��ϰ = null;

	public static void main(String[] args) {
		Student s = new Student("��", 86.8, 87.4, 54.9);
		Student s1 = new Student("��", 65.7, 75.7, 57.3);
		Student s2 = new Student("��", 24.9, 56.2, 42.8);
		Student s3 = new Student("��", 35.1, 95.5, 53.7);
		Student s4 = new Student("��", 62.7, 45.7, 83.3);
		Student s5 = new Student("��", 62.4, 52.4, 62.2);
		Set<Student> a = new TreeSet<>(new �ⲿ�Ƚ���());
		a.add(s);
		a.add(s1);
		a.add(s2);
		a.add(s3);
		a.add(s4);
		a.add(s5);
		for (Student i : a) {
			System.out.println(i);
		} // ��ΪStuent����toString����������ӡ����ʱ���ֵ�����ǵ�ַ

		Runningman r = new Runningman("�");
		Runningman r1 = new Runningman("֣��");
		Runningman r2 = new Runningman("�º�");
		Runningman r3 = new Runningman("Angelababy");
		Runningman r4 = new Runningman("������");
		Runningman r5 = new Runningman("�˳�");
		Runningman r6 = new Runningman("¹��");
		Runningman r7 = new Runningman("������");
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
		
		List<List��ϰ> c=new ArrayList<>();
		
		
	}
}
