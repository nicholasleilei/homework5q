package ��ʦ0723;

import ��ʦ0723.Outter.Inner;

public class TestOuter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Outter o = new Outter();
           System.out.println(o.a);
           o.aaa();
           
           Inner i = o.new Inner();
           System.out.println(i.b);
           i.show();
	}

}
