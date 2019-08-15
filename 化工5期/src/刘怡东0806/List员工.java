package 刘怡东0806;

import java.util.Comparator;

public class List员工 implements Comparable<List员工>{
	  private String number;
	  private String name;
	  private String sex;
	  private Double salary;
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
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
	public List员工(String number, String name, String sex, double salary) {
		super();
		this.number = number;
		this.name = name;
		this.sex = sex;
		this.salary = salary;
	}
	@Override
	public int compareTo(List员工 o) {
		// TODO Auto-generated method stub
		return this.getSalary().compareTo(o.getSalary());
	}
	  
	  
	  
	}
