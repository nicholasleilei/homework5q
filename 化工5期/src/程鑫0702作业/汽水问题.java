package 程鑫0702作业;

public class 汽水问题 {
public static void main(String[] args) {
	int p=0;int sum=0;
	for(int i=1000;i>0;i--) {
		p+=1;
		if(p%3==0) {
		i+=1;p-=3;}
	  sum++;
		}
	System.out.println(sum);
	System.out.println(p);
	
}
}
