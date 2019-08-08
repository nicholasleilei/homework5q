package ¿œ ¶0808;

import java.io.Serializable;

public class Emp implements Comparable<Emp>,Serializable{
  private int no;
  private String name;
  private String sex;
  private Double salary;
public int getNo() {
	return no;
}
public void setNo(int no) {
	this.no = no;
}
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
public Double getSalary() {
	return salary;
}
public void setSalary(Double salary) {
	this.salary = salary;
}
public Emp(int no, String name, String sex, Double salary) {
	super();
	this.no = no;
	this.name = name;
	this.sex = sex;
	this.salary = salary;
}
public Emp() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public int compareTo(Emp o) {
	// TODO Auto-generated method stub
	return this.getSalary().compareTo(o.getSalary()+1);
}
@Override
public String toString() {
	return "Emp [no=" + no + ", name=" + name + ", sex=" + sex + ", salary=" + salary + "]";
}
  
}
