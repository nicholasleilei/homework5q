package 刘怡东0723;

public class smokeTeacher  extends Person implements Smoke{

	public smokeTeacher(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public void smoke() {
		// TODO Auto-generated method stub
		System.out.println("我是会吸烟的老师"+name);
	}

}
