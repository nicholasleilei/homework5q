package 付恒鑫0702;

public class 鸡兔同笼 {

	public static void main(String[] args) {
		// 有若干只鸡兔同在一个笼子里，从上面数，有35个头,从下面数，有94只脚。问笼中各有几只鸡和兔？
		int x,y;
		for(x=0;x<35;x++) {
			y=35-x;
			if(2*x+4*y==94) {
				System.out.println("鸡"+x+"兔"+y);
			}
		}

	}

}
