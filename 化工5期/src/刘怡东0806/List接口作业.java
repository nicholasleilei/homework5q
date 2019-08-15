package 刘怡东0806;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class List接口作业 {
public static void main(String[] args) {
	Set<Integer> s=new HashSet();
	for(int i=0;i<20;i++) {
		s.add((int)(1+Math.random()*20));
	}
	List<Integer> l=new ArrayList();
	l.addAll(s);
	for(int i:l) {System.out.println(i);}
	
	
}

}