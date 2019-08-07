package 刘怡东0726;

public class StringBuffer类1 {
public static void main(String[] args) {
	String a="duqg982 e3br3766";
	boolean t=true;
	for(int i=0;i<a.length();i++) {
		if(Character.isDigit(a.charAt(i))) {
			System.out.println(Double.parseDouble(a.charAt(i)+""));
		}else t=false;
	}
	if(!t) System.out.println("有非数字");
	
	
	
	String b="fuhf2u093ruAGSDq2d WDg";
	int dx=0,xx=0,sz=0;
	for(int i=0;i<b.length();i++) {
		if(Character.isUpperCase(b.charAt(i))) {dx++;}
		if(Character.isLowerCase(b.charAt(i))) {xx++;}
		if(Character.isDigit(b.charAt(i))) {sz++;}
	}System.out.println("大写"+dx+"小写"+xx+"数字"+sz);
}
}
