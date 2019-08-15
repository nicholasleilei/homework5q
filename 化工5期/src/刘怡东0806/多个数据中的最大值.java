package 刘怡东0806;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class 多个数据中的最大值 {
public static void main(String[] args) {
	Scanner s =new Scanner(System.in);
	List<Integer> l=new ArrayList();
	while(true) {
		int a=s.nextInt();
		if(a!=0) {
		l.add(a);
		}else break;
	}
	Collections.sort(l);
	for(int i:l) {System.out.println(i);}
	System.out.println("==================");
	System.out.println(l.get(l.size()-1));
}
}
