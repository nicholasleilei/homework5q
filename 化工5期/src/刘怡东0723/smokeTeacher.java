package ������0723;

public class smokeTeacher  extends Person implements Smoke{

	public smokeTeacher(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public void smoke() {
		// TODO Auto-generated method stub
		System.out.println("���ǻ����̵���ʦ"+name);
	}

}
