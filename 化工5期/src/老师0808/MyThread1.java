package ¿œ ¶0808;

public class MyThread1 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		
		for(int i=1;i<=10;i++) {
			System.out.println(Thread.currentThread().getName()+i);
		}
	}

}
