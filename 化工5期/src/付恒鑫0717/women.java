package ������0717;

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
if(w.age<25&&w.sex.equals("Ů")) {
	System.out.println("ǣ�ֳɹ�");
}else if(w.age>25&&w.age<50&&w.sex.equals("Ů")) {
	System.out.println("��������飬ף��ɹ�");
}else {
	System.out.println("���");
}
}
}
