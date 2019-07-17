package 老师0717;

public class Person {
	String name;

	public void show(String name) {//就近原则
           System.out.println(name);
       
	}
	 public  Person() {
		 this(1);
		 System.out.println("构造方法");
	 }
	 public  Person(String a) {
		 System.out.println("构造方法--带一个string类型的参数");
	 }
	 public Person(int a) {
		 System.out.println("构造方法--带一个int类型的参数");
	 }
}
