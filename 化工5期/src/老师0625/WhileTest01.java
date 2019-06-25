package 老师0625;

public class WhileTest01 {

	public static void main(String[] args) {
		// //输出1-100之和
		int i=1;
		int sum=0;//累加器
		while(i<=100) {
			sum+=i;//sum=sum+i;
			i++;
		}
System.out.println(sum);
	}

}
