package 程鑫0808作业;



public class 测试 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		线程 t=new 线程();
		for(int i=1;i<=5;i++) {
			System.out.println("主人"+i);
		Thread t1=new Thread(t,"大象");
		Thread t2=new Thread(t,"轿车");
		t1.start();
		t2.start();
		
	}
	}}

