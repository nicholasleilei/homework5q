package 老师0809;

public class TicketTest {

	public static void main(String[] args) {
		// 模拟三个窗口售出100张票
           Ticket t = new Ticket();
           Thread t1 = new Thread(t,"窗口一");
           Thread t2 = new Thread(t,"窗口二");
           Thread t3 = new Thread(t,"窗口三");
           
           
           t1.start();
           t2.start();
           t3.start();
	}

}
