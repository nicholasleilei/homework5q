package ��ʦ0809;

public class ��ҵ01 {

	public static void main(String[] args) throws InterruptedException {
		// 1����Java������ʹ��Thread�ഴ�������̣߳�
		//�������̷ֱ߳��������д������20�䡰���󡱺͡��γ��������߳������������15�䡰���ˡ���
    Mythread my = new Mythread();
    Thread.currentThread().setPriority(1);
    Thread t1 = new Thread(my,"����");
    System.out.println(t1.isAlive());
    Thread t2 = new Thread(my,"�γ�");
    t1.setPriority(10);
    t2.setPriority(3);
    t1.start();
   //t1.join(5000);
    t2.start();
    
    System.out.println(Thread.currentThread().getPriority());
	System.out.println(t1.getPriority());
	System.out.println(t2.getPriority());
		
	}

}
