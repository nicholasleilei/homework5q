package ��ʦ0808;

public class ʵ�ֵķ�ʽʵ�ֶ��̲߳��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		MyThread1 t = new MyThread1();
		
		Thread t1 = new Thread(t);
		t1.setName("����");
		Thread t2 = new Thread(t,"����");
		
		t1.start();
		t2.start();
	}

}
