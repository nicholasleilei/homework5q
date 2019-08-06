package ¿œ ¶0806;

import java.util.Comparator;

public class MyComp implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getSum().compareTo(o2.getSum());
	}

}
