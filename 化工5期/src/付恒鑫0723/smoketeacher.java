package 付恒鑫0723;

public class smoketeacher implements smoke{
	teacher t=new teacher("张四") {
	};
	@Override
	public String smoke() {
		// TODO Auto-generated method stub
		return "我是会抽烟的好老师"+t.name;
	}

}
