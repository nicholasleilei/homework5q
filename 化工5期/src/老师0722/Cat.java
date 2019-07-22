package 老师0722;

public class Cat extends Animal{
	int a=20;
	public static void aaa() {
		   System.out.println("hellozi");
	   }
   public  void  catchMouse() {
	   System.out.println(getAge()+"岁的"+getName()+"捉老鼠");
   }

public Cat() {
	super();
	// TODO Auto-generated constructor stub
}

public Cat(String name, int age) {
	super(name, age);
	// TODO Auto-generated constructor stub
}
   
}
