package ��ʦ0805;

import java.util.LinkedList;
import java.util.List;

public class List�ӿ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          List<String>  l = new LinkedList<>();
          l.add("Z");
          l.add("H");
          l.add(null);
          l.add("Y");
          l.add("A");
          l.add("A");
          System.out.println(l);
          l.remove("Y");
          l.set(1, "Java");
          System.out.println(l);
          System.out.println(l.get(3));
          
          //List  ����  ��Ψһ  ����null
          
 //         ListIterator<String> it = l.listIterator();
//          while(it.hasNext()) {
//        	  System.out.println(it.next());
//          }
          
 //         while(it.hasPrevious()) {
 //       	  System.out.println(it.previous());
  //        }
	}

}
