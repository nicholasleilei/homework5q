package ����0722��ҵ;

public class Human {
private String name;
private int money;
public void show() {
	System.out.println(name+"��"+money+"Ԫ");
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Human(String name, int money) {
	super();
	this.name = name;
	this.money = money;
}
public int getMoney() {
	return money;
}
public void setMoney(int money) {
	this.money = money;
}
public Human() {
	super();
	// TODO �Զ����ɵĹ��캯�����
}
@Override
public String toString() {
	return "Human [name=" + name + ", money=" + money + "]";
}
}
