package 刘怡东0722;

public class 多态 {
	public static void main(String[] args) {
		Person a = new man("张三", 1000);
		man A = (man) a;
		A.have();
		Person b = new wife("张三媳妇", 10000);
		wife B = (wife) b;
		B.have();
	}
}
