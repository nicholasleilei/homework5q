package ��ʦ0722;

public class Animal {
   private String name;
   private int age;
   int a=10;
  public static void aaa() {
	   System.out.println("hello");
   }
   public void eat(String food) {
	   System.out.println(age+"���"+name+"��"+food);
   }
   public void sleep() {
	  System.out.println(age+"���"+name+"˯"); 
   }
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public Animal(String name, int age) {
	super();
	this.name = name;
	this.age = age;
}
public Animal() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Animal [name=" + name + ", age=" + age + "]";
}
   
}
