package 付恒鑫0723;

public class smokestudent implements smoke{
	student s=new student("张三") {
	};
	@Override
	public String smoke() {
		// TODO Auto-generated method stub
		return "我是会抽烟的坏学生"+s.name;
	}

}
