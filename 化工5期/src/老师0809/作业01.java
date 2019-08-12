package 老师0809;

public class 作业01 {

	public static void main(String[] args) throws InterruptedException {
		// 1、在Java程序中使用Thread类创建两个线程，
		//这两个线程分别在命令行窗口输出20句“大象”和“轿车”，主线程在命令行输出15句“主人”。
    Mythread my = new Mythread();
    Thread.currentThread().setPriority(1);
    Thread t1 = new Thread(my,"大象");
    System.out.println(t1.isAlive());
    Thread t2 = new Thread(my,"轿车");
    t1.setPriority(10);
    t2.setPriority(3);
    t1.start();
   //t1.join(5000);
    t2.start();
    
    System.out.println(Thread.currentThread().getPriority());
	System.out.println(t1.getPriority());
	System.out.println(t2.getPriority());
		
	}

}
