package ������0805;

import java.util.Comparator;

import ������0805.Student;

public class �ⲿ�Ƚ��� implements Comparator <Student>{

	@Override
	public int compare(Student o, Student o1) {
		// TODO Auto-generated method stub
		return (int)(o.getSum()-o1.getSum());
		//return o.getSum().compareTo(o1.getSum());
	}

}
