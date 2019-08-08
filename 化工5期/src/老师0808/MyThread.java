package ¿œ ¶0808;

public class MyThread extends Thread{
  
	public void run() {
		//System.out.println("hello"+Thread.currentThread().getName());
		for(int i=1;i<=10;i++) {
			System.out.println(Thread.currentThread().getName()+i);
		}
	}
}
