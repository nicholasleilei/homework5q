package ��ʦ0809;

public class TicketTest {

	public static void main(String[] args) {
		// ģ�����������۳�100��Ʊ
           Ticket t = new Ticket();
           Thread t1 = new Thread(t,"����һ");
           Thread t2 = new Thread(t,"���ڶ�");
           Thread t3 = new Thread(t,"������");
           
           
           t1.start();
           t2.start();
           t3.start();
	}

}
