package ����0805��ҵ;


import java.util.Collection;
import java.util.HashSet;
public class ���� {
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
	System.out.println("����m��"+m);
	System.out.println("����n��"+n);
    for(int i:m) {
    	 if(n.contains(i))
    		 h.add(i);
    	}
    System.out.println("����"+h);
     n.addAll(m);
     System.out.println("����"+n);
}
}
