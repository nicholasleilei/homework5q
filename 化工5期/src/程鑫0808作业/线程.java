package 程鑫0808作业;

public class 线程 implements Runnable {

	@Override
	public void run() {
		// TODO 自动生成的方法存根
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+i);
	}
		
	}

}
