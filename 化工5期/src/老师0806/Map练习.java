package ¿œ ¶0806;

import java.util.HashMap;
import java.util.Map;

public class Map¡∑œ∞ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Map<String,Card> map = new HashMap<>();
            
            map.put("10101010", new Card("c1","sdsd","2019-01-01"));
            map.put("10101011", new Card("c1","sdsd","2019-01-02"));
            map.put("10101012", new Card("c1","sdsd","2019-01-03"));
            map.put("10101013", new Card("c1","sdsd","2019-01-04"));
            
          System.out.println(map.get("11111"));;
	}

}
