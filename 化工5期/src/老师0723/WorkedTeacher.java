package ��ʦ0723;

public class WorkedTeacher extends Teacher {

	public WorkedTeacher(String name, int age) {
		super(name, age);
	}

	@Override
	public void teach() {
		// TODO Auto-generated method stub
		System.out.println(getName()+","+getAge()+"�꣬��JavaEE");
	}

}
