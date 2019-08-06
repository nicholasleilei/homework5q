package 刘怡东0805;

import java.util.Comparator;

import 刘怡东0805.Student;

public class 外部比较器 implements Comparator <Student>{

	@Override
	public int compare(Student o, Student o1) {
		// TODO Auto-generated method stub
		return (int)(o.getSum()-o1.getSum());
		//return o.getSum().compareTo(o1.getSum());
	}

}
