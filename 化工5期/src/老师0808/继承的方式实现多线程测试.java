package ��ʦ0808;

public class �̳еķ�ʽʵ�ֶ��̲߳��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println(Thread.currentThread().getName());
       MyThread my = new MyThread();
       my.setName("����");
       my.start();//start -->run//ִ������
		
       
       MyThread my1 = new MyThread();
       my1.setName("����");
       my1.start();//start -->run//ִ������
	}

}
