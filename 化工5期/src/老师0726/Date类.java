package ¿œ ¶0726;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date¿‡ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Date d = new Date();
      System.out.println(d);
      System.out.println(d.getYear()+1900);
      System.out.println(d.getMonth()+1);
      System.out.println(d.getDate());
      System.out.println(d.getDay());
     // 0-7  1
      System.out.println(d.getHours());
      System.out.println(d.getMinutes());
      System.out.println(d.getSeconds());
      
      SimpleDateFormat  sdf = new SimpleDateFormat("yy/MM/dd");
      System.out.println(sdf.format(new Date()));
      
      try {
		Date date =sdf.parse("1978/12/30");
		System.out.println(date.getYear()+1900);//283881600000
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      
      
      
	}

}
