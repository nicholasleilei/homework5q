package 程鑫0805作业;


import java.util.Collection;
import java.util.HashSet;
public class 集合 {
public static void main(String[] args) {
	Collection<Integer> m = new HashSet<>();
	Collection<Integer> n= new HashSet<>();
	Collection<Integer> h= new HashSet<>();
	m.add((int)(Math.random()*9));
	m.add((int)(Math.random()*9));
	m.add((int)(Math.random()*9));
	n.add((int)(Math.random()*9));
	n.add((int)(Math.random()*9));
	n.add((int)(Math.random()*9));
	n.add((int)(Math.random()*9));
	System.out.println("集合m："+m);
	System.out.println("集合n："+n);
    for(int i:m) {
    	 if(n.contains(i))
    		 h.add(i);
    	}
    System.out.println("交集"+h);
     n.addAll(m);
     System.out.println("并集"+n);
}
}
