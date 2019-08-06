package 刘怡东0805;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class CollectionTest {
public static void main(String[] args) {
	Cat c=new Cat("c","黑");
	Cat c1=new Cat("c1","蓝");
	Cat c2=new Cat("c2","白");
	Cat c3=new Cat("c3","花");
	Collection<Cat> coll= new HashSet();//此处不能用TreeSet 他会按照字典比较，c会重复会异常
	coll.add(c);
	coll.add(c1);
	coll.add(c2);
	coll.add(c3);
//	System.out.println(coll);是不对的。必须用foreach或者Iterator迭代器输出
	Iterator<Cat> it=coll.iterator();
	while(it.hasNext()) {System.out.println(it.next());}
	
	//foreach
	for(Cat cc:coll) {System.out.println(cc);}
	
	System.out.println(coll);//直接输出
	
	
	
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
	}System.out.println("交集为"+conn4);
	conn2.addAll(conn3);
	System.out.println("并集"+conn2);
	
	
	
	
}
}
