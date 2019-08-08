package 老师0808;

public class 继承的方式实现多线程测试 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println(Thread.currentThread().getName());
       MyThread my = new MyThread();
       my.setName("张三");
       my.start();//start -->run//执行其他
		
       
       MyThread my1 = new MyThread();
       my1.setName("李四");
       my1.start();//start -->run//执行其他
	}

}
