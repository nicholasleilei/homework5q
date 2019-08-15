package ¿œ ¶0815;

public class Employee {
   private String name;
   private String sex;
   private int age;
   private String address;
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
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public Employee(String name, String sex, int age, String address) {
	super();
	this.name = name;
	this.sex = sex;
	this.age = age;
	this.address = address;
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Employee [name=" + name + ", sex=" + sex + ", age=" + age + ", address=" + address + "]";
}
   
   
}
