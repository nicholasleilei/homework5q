package 刘怡东0723;

public class 经理 extends 员工{

	public 经理(String name, int number) {
		super(name, number);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void work() {
		System.out.println("我是经理"+getName()+getNumber());
		
	}

	@Override
	public int earn() {
	return 10000;
		
	}

}
