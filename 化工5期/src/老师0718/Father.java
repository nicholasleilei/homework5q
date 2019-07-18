package 老师0718;

public class Father {
	final int a=10;
	public  void show() {
		System.out.println("父类show");
	}
   public Father() {
	   System.out.println("父类无参的构造方法");
   }
   public Father(String a) {
	   System.out.println("父类有一个String参的构造方法");
   }
   public Father(String a,String b) {
	   System.out.println("父类有两个string的构造方法");
   }
   public Father(int a) {
	   System.out.println("父类有一个int的构造方法");
   }
}
