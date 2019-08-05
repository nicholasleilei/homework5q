package ¸¶ºãöÎ0722;

public class person {
private String name;
private String money;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getMoney() {
	return money;
}
public void setMoney(String money) {
	this.money = money;
}
public person(String name, String money) {
	super();
	this.name = name;
	this.money = money;
}
public person() {
	super();
	// TODO Auto-generated constructor stub
}
public void show() {
	System.out.println(name+"ÓÐ"+money+"ÔªÇ®");
}
}
