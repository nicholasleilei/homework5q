package ������0723;

public abstract class jingli extends worker{
	public jingli(String name,String number,int money) {
		super(name, number, money);
	}
	
	
	public  void jiangjin() {
System.out.println("�����н���");
}

	@Override
	public void work() {
		System.out.println("���Ǿ���"+getName()+getNumber());
		
	}

	@Override
	public int earn() {
	return 10000;
		
	}

}