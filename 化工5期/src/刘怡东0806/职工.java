package 刘怡东0806;

import java.util.Comparator;

import 老师0808.Emp;

 
public class 职工 {
private String name,sex;
private Double money;
private long old,number;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSex() {
	return sex;
}
public void setSex(String sex) {
	this.sex = sex;
}
public double getOld() {
	return old;
}
public void setOld(long old) {
	this.old = old;
}

public long getNumber() {
	return number;
}
public void setNumber(long number) {
	this.number = number;
}
public Double getMoney() {
	return money;
}
public void setMoney(double money) {
	this.money = money;
}
public 职工(String name, String sex, double money, long old, long number) {
	super();
	this.name = name;
	this.sex = sex;
	this.money = money;
	this.old = old;
	this.number = number;
}
public String toString() {
	return "职工 [姓名=" + name + ", 性别=" + sex + ", 工资=" + money + ", 年龄=" + old + ", 工号=" + number + "]";
}


}
