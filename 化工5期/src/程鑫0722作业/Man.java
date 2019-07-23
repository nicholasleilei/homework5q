package 程鑫0722作业;

public class Man extends Human{
public void useMoney() {
	System.out.println(getName()+"花了"+getMoney());
}
public void makeMoney() {
	System.out.println(getName()+"的老婆有"+getMoney()+"元");}
public Man() {
	super();
	// TODO 自动生成的构造函数存根
}

public Man(String name, int money) {
	super(name, money);
	// TODO 自动生成的构造函数存根
}
}
