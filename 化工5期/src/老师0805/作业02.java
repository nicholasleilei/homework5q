package 老师0805;

public class 作业02 {

	public static void main(String[] args) {
		/*
		 * 1、随机生成0-9A-Za-z的4位验证码
   从键盘接收用户录入的验证码对两个验证码做比较
   如果相等（不考虑大小写）就输出验证成功 不相等则输出验证码输入错误
		 */
		String str="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZqwertyuioplkjhgfdsazxcvbnm";
		String code="";
		for(int i=0;i<4;i++) {
			int a=(int)(Math.random()*(str.length()));
			code+=str.charAt(a);
		}
System.out.println(code);
	}

}
