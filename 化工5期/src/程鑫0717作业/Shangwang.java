package ����0717��ҵ;

public class Shangwang {
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	String name;
	 int age;
	 private int type;
	public Shangwang(String name, int age, int type) {
		super();
		this.name = name;
		this.age = age;
		this.type = type;
	}
	public Shangwang() {
		super();
		// TODO �Զ����ɵĹ��캯�����
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	 
}
