package 老师0723;

public abstract class Animal {
	//如果一个类中包含抽象方法 那么这个类一定是抽象类
	//但是抽象类中，并不一定只包含抽象方法
    private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    public abstract void eat();
    public void sleep() {
    	System.out.println("睡");
    }
}
