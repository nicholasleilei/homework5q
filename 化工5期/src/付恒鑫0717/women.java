package 付恒鑫0717;

public class women {
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
public women(String name, String sex, int age) {
	super();
	this.name = name;
	this.sex = sex;
	this.age = age;

}	public void check(women w) {
if(w.age<25&&w.sex.equals("女")) {
	System.out.println("牵手成功");
}else if(w.age>25&&w.age<50&&w.sex.equals("女")) {
	System.out.println("进入大龄组，祝你成功");
}else {
	System.out.println("灭灯");
}
}
}
