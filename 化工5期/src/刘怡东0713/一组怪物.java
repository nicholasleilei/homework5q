package 刘怡东0713;

public class 一组怪物 {public static void main(String[] args) {
	

	int A=380;
	int B=110;//可以改成数组
	int C=0;
	boolean i = true;
	while(i) {
	int a=(int)(5+Math.random()*(8-5+1));
	int b=(int)(3+Math.random()*(5-3+1));
	System.out.print("英雄攻击怪物，此怪物损失");
	System.out.print(a);
	System.out.println("滴血量 ");
	B-=a;if(B<=0){System.out.println("怪物死亡,进行下一轮");C++;
	if(C==1) {B=100;continue;}
	if(C==2) {B=120;continue;}
	if(C==3) {B=130;continue;}
	if(C==4) {B=110;continue;}}
	System.out.print("怪物攻击英雄，英雄损失");
	System.out.print(b);
	System.out.println("滴血量");
	A-=b;if(A<=0) {System.out.println("英雄死亡，游戏结束！");break;}	
	}
}
}