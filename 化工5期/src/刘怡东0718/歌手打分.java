package 刘怡东0718;

public class 歌手打分 {
public static void main(String[] args) {
	double[] a= {1,2,3,4,5,6,7,8,9,0.3};
	double b = a[0],c = a[0],sum=0;
	for(int i=0;i<a.length;i++) {
		if(b<a[i]) {
			b=a[i];
		}
		if(c>a[i]) {
			c=a[i];
		}
		sum+=a[i];}
	System.out.println((sum-b-c)/8);
	System.out.println(b);
	System.out.println(c);
	
}}
