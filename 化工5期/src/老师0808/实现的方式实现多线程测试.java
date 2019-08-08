package 老师0808;

public class 实现的方式实现多线程测试 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		MyThread1 t = new MyThread1();
		
		Thread t1 = new Thread(t);
		t1.setName("张三");
		Thread t2 = new Thread(t,"李四");
		
		t1.start();
		t2.start();
	}

}
