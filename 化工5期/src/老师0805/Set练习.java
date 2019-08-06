package 老师0805;

import java.util.HashSet;
import java.util.Set;

public class Set练习 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Set<Integer> A = new HashSet<>();
         A.add(1);
         A.add(2);
         A.add(3);
         A.add(4);
         
         Set<Integer> B = new HashSet<>();
         B.add(1);
         B.add(3);
         B.add(5);
         B.add(7);
         B.add(9);
         B.add(11);
         
         System.out.println("A:"+A);
         System.out.println("B:"+B);
         
         System.out.print("交集：");
         for(int i:A) {
        	 if(B.contains(i))
        		 System.out.print(i+" ");
         }
         System.out.println();
         
         B.addAll(A);
         System.out.println("并集："+B);
	}

}
