package 老师0722;

public class Dog extends Animal{
   public  void  lookHome() {
	   System.out.println(getAge()+"岁的"+getName()+"看家");
   }

public Dog() {
	super();
	// TODO Auto-generated constructor stub
}

public Dog(String name, int age) {
	super(name, age);
	// TODO Auto-generated constructor stub
}
   
}
