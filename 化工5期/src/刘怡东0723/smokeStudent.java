package ������0723;

public class smokeStudent extends Person implements Smoke{

	public smokeStudent(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void smoke() {
		// TODO Auto-generated method stub
		System.out.println("���ǻ����̵�ѧ��"+name);
	}

}
