package 老师0805;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;


public class Collection接口 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Collection<String> conn = new HashSet<>();
          conn.add("123");
          conn.add("abc");
          
          
          Collection<String> conn1 = new ArrayList<>();
          //conn.clear();
          conn1.addAll(conn);
          conn1.add("777");
          
          System.out.println(conn1);
          
          //conn1.remove("777");
         /// conn1.removeAll(conn);
         ;
          System.out.println( conn1.contains("77"));
          System.out.println(conn1.isEmpty());
          System.out.println(conn1.size());
         Object[] strs = conn1.toArray();
         
         //迭代器
         Iterator<String> it = conn1.iterator();
         while(it.hasNext()) {
        	
        	// it.remove();
        	System.out.println(it.next()); 
         }
         
//         for(int i=0;i<conn1.size();i++) {
//        	 conn1.
//         }
         System.out.println("------------------------------");
         for(String s:conn1) {
        	 System.out.println(s);
         }
	}

}
