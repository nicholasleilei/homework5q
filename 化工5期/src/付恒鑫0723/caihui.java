package 付恒鑫0723;

public class caihui extends worker{

	public caihui(String name, int number) {
		super(name, number);}

		@Override
		public void work() {
			// TODO Auto-generated method stub
			System.out.println("我是财会"+getName()+getNumber());
		}

		@Override
		public int earn() {
			// TODO Auto-generated method stub
			return 521;
		}

}
