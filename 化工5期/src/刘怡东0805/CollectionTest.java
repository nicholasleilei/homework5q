package ������0805;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class CollectionTest {
public static void main(String[] args) {
	Cat c=new Cat("c","��");
	Cat c1=new Cat("c1","��");
	Cat c2=new Cat("c2","��");
	Cat c3=new Cat("c3","��");
	Collection<Cat> coll= new HashSet();//�˴�������TreeSet ���ᰴ���ֵ�Ƚϣ�c���ظ����쳣
	coll.add(c);
	coll.add(c1);
	coll.add(c2);
	coll.add(c3);
//	System.out.println(coll);�ǲ��Եġ�������foreach����Iterator���������
	Iterator<Cat> it=coll.iterator();
	while(it.hasNext()) {System.out.println(it.next());}
	
	//foreach
	for(Cat cc:coll) {System.out.println(cc);}
	
	System.out.println(coll);//ֱ�����
	
	
	
	System.out.println("===============================");
	Collection<Integer> conn2=new TreeSet<>();
	conn2.add((int) ((int) 0+Math.random()*9));
	conn2.add((int) ((int) 0+Math.random()*9));
	conn2.add((int) ((int) 0+Math.random()*9));
	conn2.add((int) ((int) 0+Math.random()*9));
	conn2.add((int) ((int) 0+Math.random()*9));
	Collection<Integer> conn3=new TreeSet<>();
	conn3.add((int) ((int) 0+Math.random()*9));
	conn3.add((int) ((int) 0+Math.random()*9));
	conn3.add((int) ((int) 0+Math.random()*9));
	conn3.add((int) ((int) 0+Math.random()*9));
	conn3.add((int) ((int) 0+Math.random()*9));
	Collection<Integer> conn4=new TreeSet<>();
	for(int i:conn2) {
		if(conn3.contains(i)) {
			conn4.add(i);
		}
	}System.out.println("����Ϊ"+conn4);
	conn2.addAll(conn3);
	System.out.println("����"+conn2);
	
	
	
	
}
}
