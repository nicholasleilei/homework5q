package Áõâù¶«0805;

public class Student{// implements Comparable<Student>{
private String name;
private double Math,Chinese,English,sum;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getMath() {
	return Math;
}
public void setMath(double math) {
	Math = math;
}
public double getChinese() {
	return Chinese;
}
public void setChinese(double chinese) {
	Chinese = chinese;
}
public double getEnglish() {
	return English;
}
public void setEnglish(double english) {
	English = english;
}
@Override
public String toString() {
	return "Student [name=" + name + ", Math=" + Math + ", Chinese=" + Chinese + ", English=" + English +",Sum"+getSum()+ "]";
}
public Student(String name, double math, double chinese, double english) {
	super();
	this.name = name;
	Math = math;
	Chinese = chinese;
	English = english;
}

public double getSum() {
	return Math+Chinese+English;
}

//@Override
//public int compareTo(Student o) {
//	// TODO Auto-generated method stub
//	return (int)(o.getSum()-this.getSum());
//}
}
