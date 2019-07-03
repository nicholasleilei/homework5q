package 刘怡东0702;

public class 计算一到九阶乘的和 {
public static void main(String[] args) {int sum=0 ;
	for(int j=1;j<=9;j++) {
	for(int i=1,a=1;i<=j;i++) {
		a*=i;
		sum+=a;	
	}
		
		
	}System.out.println(sum);
}

}
