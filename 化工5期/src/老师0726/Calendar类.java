package ¿œ ¶0726;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Calendar¿‡ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Calendar c =Calendar.getInstance();
       
       
       c.set(2019, 7, 26);
       System.out.println(c.get(Calendar.YEAR));
       System.out.println(c.get(Calendar.DATE));
       System.out.println(c.get(Calendar.DAY_OF_MONTH));
       System.out.println(c.get(Calendar.DAY_OF_WEEK));
       System.out.println(c.get(Calendar.DAY_OF_YEAR));
       
       System.out.println(c.getTime().getTime());;
      
       
       GregorianCalendar gc = new GregorianCalendar();
      System.out.println(gc.isLeapYear(2020)); 
       
	}

}
