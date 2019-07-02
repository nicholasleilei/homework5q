package 付恒鑫homework625;
public class test1 {

	public static void main(String[] args) {
		// 输出1-100之间所有偶数之和及奇数之和
		int i =1;
		int x =0;int y=0;
		while(i<=100){
		   if(i%2==0) {
			  x+=i;
		   }else {
			   y+=i;
		   }
		   i++;
	}
		System.out.println(x+"偶数之和");
		System.out.println(y+"奇数之和");
}
	
}
