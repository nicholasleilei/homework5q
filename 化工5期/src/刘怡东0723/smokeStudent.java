package 刘怡东0723;

public class smokeStudent extends Person implements Smoke{

	public smokeStudent(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void smoke() {
		// TODO Auto-generated method stub
		System.out.println("我是会吸烟的学生"+name);
	}

}
