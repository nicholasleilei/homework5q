package 老师0718;

public class Son extends Father{
	//int a=20;
	
	  public void show() {//子类中出现了同父类方法的声明和参数都相同的方法叫做方法的重写 或覆盖
	  System.out.println("子类show"+super.a);
	  }
	 
	
	  public Son() {
		  this("332423");
		   System.out.println("子类无参的构造方法");
	   }
	   public Son(String a) {
		   super("","");
		   System.out.println("子类有一个String参的构造方法");
	   }
	   public Son(String a,String b) {
		   System.out.println("子类有两个string的构造方法");
	   }
	   public Son(int a) {
		   System.out.println("子类有一个int的构造方法");
	   }
}
