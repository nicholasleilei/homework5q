package ������0718;

import ������0718.Person;

public class ��̬ {
	public static void main(String[] args) {
		Person p = new Person();
		p.firstname = "�Ϲ�";
		Person p1 = new Person();//��ʱp1��firstname��û�б���ֵ
		p1.lastname = "���";
		p1.showname();
		System.out.println(Person.i);
	}
}
