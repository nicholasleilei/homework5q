package ����0808��ҵ;



public class ���� {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		�߳� t=new �߳�();
		for(int i=1;i<=5;i++) {
			System.out.println("����"+i);
		Thread t1=new Thread(t,"����");
		Thread t2=new Thread(t,"�γ�");
		t1.start();
		t2.start();
		
	}
	}}

