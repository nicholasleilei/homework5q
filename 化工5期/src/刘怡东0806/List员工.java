package ������0806;

import java.util.Comparator;

public class ListԱ�� implements Comparable<ListԱ��>{
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
	public ListԱ��(String number, String name, String sex, double salary) {
		super();
		this.number = number;
		this.name = name;
		this.sex = sex;
		this.salary = salary;
	}
	@Override
	public int compareTo(ListԱ�� o) {
		// TODO Auto-generated method stub
		return this.getSalary().compareTo(o.getSalary());
	}
	  
	  
	  
	}
