package 老师0809;

public class Mythread implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		  for(int i=0;i<20;i++) {
			 //if(Thread.currentThread().getName().equals("大象"))
				// Thread.currentThread().interrupt();//打断正在休眠的线程会出现异常
				 //Thread.yield();//
			 System.out.println(Thread.currentThread().getName()+i);
		  }
	}

}
