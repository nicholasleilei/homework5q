package 老师0805;

public class 作业06 {

	public static void main(String[] args) {
		/*
		 * 2。校验QQ号码，要求：1.必须是5-15位数字  2.不能以0开头
如果复合要求输出登录成功 否则给出相应的提示
		 */
		String qq="02";
		 boolean f =true;
		if(qq.length()<5||qq.length()>15) {
			f=false;
			System.out.println("qq号码的长度应该为5-15之间");
		}
		if(qq.startsWith("0")) {
			f=false;
			System.out.println("不能以0开头");
		}
		
		if(f) {
			System.out.println("登录成功");
		}else {
			System.out.println("登录失败");
		}

	}

}
