package 老师0718;

public class Person {
   static String firstname;
   static String lastname;
   
   static {
	   System.out.println("这是静态块，在构造方法执行之前，执行一次，并且只执行一次");
   }
   public Person() {
	   System.out.println("这是无参的构造方法，在创建对象的时候会被默认的调用");
   }
    public static void showName() {
    	System.out.println(firstname+" "+lastname);
    	
    }
    public  void showName1() {
    	System.out.println(firstname+" "+lastname);
    	showName();
    }
	
    
}
