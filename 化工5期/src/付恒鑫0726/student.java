package ¸¶ºãöÎ0726;

import java.util.Comparator;

public  class student implements Comparator<student>{
private String name;
private Double chinese;
private Double math;
private Double english;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Double getChinese() {
	return chinese;
}
public void setChinese(Double chinese) {
	this.chinese = chinese;
}
public Double getMath() {
	return math;
}
public void setMath(Double math) {
	this.math = math;
}
public Double getEnglish() {
	return english;
}
public void setEnglish(Double english) {
	this.english = english;
}
public student(String name, Double chinese, Double math, Double english) {
	super();
	this.name = name;
	this.chinese = chinese;
	this.math = math;
	this.english = english;
}
public student() {
	super();
	// TODO Auto-generated constructor stub
}
public Double  getSum() {
	return chinese+math+english;
	
}


@Override
public String toString() {
	double getSum = chinese+math+english;
	return "student [name=" + name + ", chinese=" + chinese + ", math=" + math + ", english=" + english + ", getsum"+ getSum +"]";
}
@Override
public int compare(student o1, student o2) {
	// TODO Auto-generated method stub
	return o2.getSum().compareTo(o1.getSum());
}


}
