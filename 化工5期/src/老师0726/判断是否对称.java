package 老师0726;

public class 判断是否对称 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2. 使用stringbuffer类中的方法完成判断字符串是否对称
		String str= "abcba";
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		System.out.println(str.equals(sb.toString())?"对称":"不对称");
	}

}
