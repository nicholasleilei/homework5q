package 老师0722;

public class 多态 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Animal a = new Cat("咪咪",2);
         a.eat("鱼");
         a.sleep();
         
       System.out.println(a.a);//20 10
       a.aaa();
       //成员变量：编译看左边，运行看左边
       //成员方法：编译看左边,  运行看右边
       //静态方法：编译看左边，运行看左边 
         
	}

}
