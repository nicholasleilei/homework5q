package 老师0809;

public class ObjectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Object o = new Object();
         
         Thread  t1 = new Thread() {
        	 public void run() {
        		 synchronized(o) {
        			 System.out.println("线程1开始");
            		 try {
    					o.wait();//线程1等待，并释放锁
    				} catch (InterruptedException e) {
    					// TODO Auto-generated catch block
    					e.printStackTrace();
    				}
            		 System.out.println("线程1结束");
            
        		 }
        		
        	 }
         };
         Thread  t2 = new Thread() {
        	 public void run() {
        		synchronized (o) {
        			 System.out.println("线程2开始");
        			 //o.notify();//激活
        			 o.notifyAll();
            		 System.out.println("线程2结束");
				}
        		
        	 }
         };
         
         t1.start();
         t2.start();
        
	}

}
