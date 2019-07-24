package 老师0724;

import java.util.Scanner;

public class Object类 {
String a="";
Scanner sc;
public static void main(String[] args) {
	Person p = new Person("张三","男");
	Person p1 = new Person("张三","男");
	 
	System.out.println(p.hashCode());
	System.out.println(p1.hashCode());
	
	//如果两个对象是同一个对象 那么他们的hashcode一定相同
	//如果两个对象的hashcode相同，那么他们也不一定是同一个对象
//	final finally finalize 区别
	String aa="123";
	       aa="333";
}
}
