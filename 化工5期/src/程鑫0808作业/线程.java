package ����0808��ҵ;

public class �߳� implements Runnable {

	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+i);
	}
		
	}

}
