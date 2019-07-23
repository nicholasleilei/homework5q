package 付恒鑫0702;

public class 收破烂 {

	public static void main(String[] args) {
		// 共有1000瓶汽水，每次喝完一瓶后得到一个空瓶子，每三个空瓶子又能换一瓶汽水
//		          喝掉以后又能得到一个空瓶子，问总共能喝多少瓶汽水，最后还剩余多少个空瓶子
		int qi=0, kong=0;
		for(int i=1000;i>=0;i--) {kong++;
			if(kong%3==0) {
				i++;kong-=3;
			}qi++;
		}System.out.println(kong+"个空瓶"+qi+"瓶汽水");
	}

}
