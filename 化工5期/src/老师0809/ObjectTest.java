package ��ʦ0809;

public class ObjectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Object o = new Object();
         
         Thread  t1 = new Thread() {
        	 public void run() {
        		 synchronized(o) {
        			 System.out.println("�߳�1��ʼ");
            		 try {
    					o.wait();//�߳�1�ȴ������ͷ���
    				} catch (InterruptedException e) {
    					// TODO Auto-generated catch block
    					e.printStackTrace();
    				}
            		 System.out.println("�߳�1����");
            
        		 }
        		
        	 }
         };
         Thread  t2 = new Thread() {
        	 public void run() {
        		synchronized (o) {
        			 System.out.println("�߳�2��ʼ");
        			 //o.notify();//����
        			 o.notifyAll();
            		 System.out.println("�߳�2����");
				}
        		
        	 }
         };
         
         t1.start();
         t2.start();
        
	}

}
