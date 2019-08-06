package Áõâù¶«0726;

public class StringBufferÀà {
	public static void main(String[] args) {
		StringBuffer a = new StringBuffer("To be or not to be");
		StringBuffer b = a.reverse();
		System.out.println(a);
		String[] d = b.toString().split(" ");
		System.out.print(b+" ");System.out.println();
		for (int i = d.length - 1; i >= 0; i--) {
			System.out.print(d[i] + " ");
		}
		System.out.println();
		StringBuffer A = new StringBuffer("To be or not to be");
		String[] c = A.toString().split(" ");
		for (int i = c.length - 1; i >= 0; i--) {
			System.out.print(c[i] + " ");
		}System.out.println();
		
		StringBuffer B=new StringBuffer("To be or not to be");
		System.out.println(B.toString().split(" ").length);
		System.out.println(B);
		int count=0;
		String check="to";
		String k=B.toString().toLowerCase();
		System.out.println(k);
		int i=k.indexOf(check);System.out.println(i);
		while(i!=-1) {
			count++;
			k=k.substring(i+check.length()-1);
			i=k.indexOf(check);
			
		}System.out.println(count);
		
	}
}
