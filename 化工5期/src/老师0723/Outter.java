package ¿œ ¶0723;

public class Outter {
	int a =10;
	public class Inner {
		int b=20;
        public void show() {
        	System.out.println(a);
        	aaa();
        }
	}
	public void aaa() {
		Inner i = new Inner();
		System.out.println(i.b);
		i.show();
	}
}
