package ������0717;

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

		
		if (o.age>65&&o.sex.equals("��")) {
			System.out.println(o.name+o.age+"��"+1000+"Ԫ");
		}
		else if(o.age>65&&o.sex.equals("Ů")) {
			System.out.println(o.name+o.age+"��"+800+"Ԫ");
		}
	}
	

void check(oldman[] old) {
	// TODO Auto-generated method stub
	
}
}
