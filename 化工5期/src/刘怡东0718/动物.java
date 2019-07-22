package 刘怡东0718;

public class 动物 {
	String name;

	public 动物(String a) {
		this.name = a;
	}

	public void eat(String a) {
		System.out.print(name + "吃" + a + ",");
	}

	public void can(String a) {
		System.out.println(name + a);
	}
}
