package ��ʦ0809;

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
			System.out.println(Thread.currentThread().getName()+"�����۳���"+(100-tickets+1)+"��Ʊ����Ʊ��"+(tickets--));
		}
	}

}
