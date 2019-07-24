package 老师0724;

import java.io.CharConversionException;

public class 包装类 {
public static void main(String[] args) {
	int i=10;
	Integer ii = 20; //向上转型   //自动装箱
	
    int a = ii;//向下转型的时候默认的   --自动拆箱
	System.out.println(Integer.valueOf("123"));//将（）里面的转成Integer型
	System.out.println(Integer.parseInt("333"));
	
	System.out.println(Double.parseDouble("2222"));
	System.out.println(Double.valueOf("222233"));
	
	
	System.out.println(Character.isDigit('r'));
	System.out.println(Character.isLetter('a'));
	System.out.println(Character.isUpperCase('a'));
	System.out.println(Character.isLowerCase('a'));
	System.out.println(Character.isSpace('a'));
}
}
