package 刘怡东0718;

import 刘怡东0718.Person;

public class 静态 {
	public static void main(String[] args) {
		Person p = new Person();
		p.firstname = "上官";
		Person p1 = new Person();//此时p1的firstname并没有被赋值
		p1.lastname = "婉儿";
		p1.showname();
		System.out.println(Person.i);
	}
}
