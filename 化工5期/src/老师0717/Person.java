package ��ʦ0717;

public class Person {
	String name;

	public void show(String name) {//�ͽ�ԭ��
           System.out.println(name);
       
	}
	 public  Person() {
		 this(1);
		 System.out.println("���췽��");
	 }
	 public  Person(String a) {
		 System.out.println("���췽��--��һ��string���͵Ĳ���");
	 }
	 public Person(int a) {
		 System.out.println("���췽��--��һ��int���͵Ĳ���");
	 }
}
