package ��ʦ0809;

public class Mythread implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		  for(int i=0;i<20;i++) {
			 //if(Thread.currentThread().getName().equals("����"))
				// Thread.currentThread().interrupt();//����������ߵ��̻߳�����쳣
				 //Thread.yield();//
			 System.out.println(Thread.currentThread().getName()+i);
		  }
	}

}
