package ¸¶ºãöÎ0717;

public class oldman {
private String name;
private String sex;
private int age;
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
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public oldman(String name, String sex, int age) {
	super();
	this.name = name;
	this.sex = sex;
	this.age = age;
}
public void check(oldman o) {

		
		if (o.age>65&&o.sex.equals("ÄÐ")) {
			System.out.println(o.name+o.age+"Ëê"+1000+"Ôª");
		}
		else if(o.age>65&&o.sex.equals("Å®")) {
			System.out.println(o.name+o.age+"Ëê"+800+"Ôª");
		}
	}
	

void check(oldman[] old) {
	// TODO Auto-generated method stub
	
}
}
