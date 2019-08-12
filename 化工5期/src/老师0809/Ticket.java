package 老师0809;

public class Ticket implements Runnable{
   int tickets=100;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
//		synchronized (this) {
//		
//		}
		sell();
	}
	
	public synchronized void sell() {
		while(tickets>0) {
			System.out.println(Thread.currentThread().getName()+"正在售出第"+(100-tickets+1)+"张票，余票："+(tickets--));
		}
	}

}
