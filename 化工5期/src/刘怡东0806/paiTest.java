package 刘怡东0806;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class paiTest {
public static void main(String[] args) {
	String[] num= {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	String[] clr= {"♠","♥","♣","♦"};
	List<String> l=new ArrayList();
	for(int i=0;i<4;i++) {
		for(int j=0;j<13;j++) {
			String pai=num[j]+clr[i];
			l.add(pai);
		}
	}
	l.add("大王");
	l.add("小王");
	System.out.println(l.size());
	Collections.shuffle(l);
	System.out.println("p1");
	for(int i=0;i<17;i++) {
		System.out.println(l.get(0));
		l.remove(l.get(0));
	}
	
	System.out.println("p2");
	for(int i=0;i<17;i++) {
		System.out.println(l.get(0));
		l.remove(l.get(0));
	}
	System.out.println("p3");
	System.out.println(l.size());
	for(int i=0;i<17;i++) {
		System.out.println(l.get(0));
		l.remove(l.get(0));
	}
	System.out.println("dipai");
	for(int i=0;i<3;i++) {
		System.out.println(l.get(i));
	}
}
}
