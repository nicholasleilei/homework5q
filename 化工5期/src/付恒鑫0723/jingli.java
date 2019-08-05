package 付恒鑫0723;

public abstract class jingli extends worker{
	public jingli(String name,String number,int money) {
		super(name, number, money);
	}
	
	
	public  void jiangjin() {
System.out.println("经理有奖金");
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