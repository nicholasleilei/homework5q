package ¿œ ¶0806;

public class Student {//implements Comparable<Student>{
  private String name;
  private Double chinese;
  private Double mathic;
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
public Double getMathic() {
	return mathic;
}
public void setMathic(Double mathic) {
	this.mathic = mathic;
}
public Double getEnglish() {
	return english;
}
public void setEnglish(Double english) {
	this.english = english;
}
public Student(String name, Double chinese, Double mathic, Double english) {
	super();
	this.name = name;
	this.chinese = chinese;
	this.mathic = mathic;
	this.english = english;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
  
 public Double getSum() {
	 return chinese+mathic+english;
 }
//@Override
//public int compareTo(Student o) {
//	// TODO Auto-generated method stub
//	//return o.getSum().compareTo(this.getSum());
//	return (int)(o.getSum()-this.getSum());
//}
@Override
public String toString() {
	return "Student [name=" + name + ", chinese=" + chinese + ", mathic=" + mathic + ", english=" + english + "sum="+getSum()+"]";
}


}
