package 刘怡东0723;

public class 财会 extends 员工{

	public 财会(String name, int number) {
		super(name, number);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("我是财会"+getName()+getNumber());
	}

	@Override
	public int earn() {
		// TODO Auto-generated method stub
		return 5000;
	}

}
