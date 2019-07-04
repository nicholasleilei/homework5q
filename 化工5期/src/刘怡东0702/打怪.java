package Áõâù¶«0702;

public class ´ò¹Ö {
public static void main(String[] args) {

	int A=330;
	int B=500;
	boolean i=true;
	while(i) {
	int a=(int)(5+Math.random()*(8-5+1));
	int b=(int)(3+Math.random()*(5-3+1));
	System.out.print("Ó¢ĞÛ¹¥»÷¹ÖÎï£¬¹ÖÎïËğÊ§");
	System.out.print(a);
	System.out.println("µÎÑªÁ¿");
	B-=a;if(B<=0){System.out.println("¹ÖÎïËÀÍö,½øĞĞÏÂÒ»ÂÖ");B=500;continue;}
	System.out.print("¹ÖÎï¹¥»÷Ó¢ĞÛ£¬Ó¢ĞÛËğÊ§");
	System.out.print(b);
	System.out.println("µÎÑªÁ¿");
	A-=b;if(A<=0) {System.out.println("Ó¢ĞÛËÀÍö£¬ÓÎÏ·½áÊø£¡");break;}	
	}
}
}
