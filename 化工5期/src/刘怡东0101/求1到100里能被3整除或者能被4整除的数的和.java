package 刘怡东0101;

public class 求1到100里能被3整除或者能被4整除的数的和 {
public static void main(String[] args) {

	int i = 1;
	int a = 0;
	while (i <= 100) {
		while(i%3==0||i%4==0) {a+=i;break;}
		i++;
	}
		System.out.println(a+"是满足条件的数的和         ");	
}
}
