package Áõâù¶«0806;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class MapTest {
public static void main(String[] args) {
	
	   Map<Double,Integer> map = new HashMap<>();
       map.put(200.0, 1000);
       map.put(300.0, 2000);
       map.put(100.0, 500);
       map.put(600.0, 300);
       
       System.out.println(map);
       Set<Map.Entry<Double,Integer>> a=map.entrySet();
}
}
