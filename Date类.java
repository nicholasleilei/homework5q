package 刘怡东0726;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date类 {
public static void main(String[] args) {
	SimpleDateFormat a=new SimpleDateFormat("yyyy年mm月dd日");
	System.out.println(a.format(new Date()));
//System.out.println(new Date().getTime());
	
	
}
}
