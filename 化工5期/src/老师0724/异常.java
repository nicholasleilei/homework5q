package 老师0724;

public class 异常 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1.可以没有catch
		// 2.可以没有finally
		System.out.println(saaaa());
	}

	@SuppressWarnings("finally")
	public static int saaaa() {
		try {
			///

			try {

			} catch (Exception a) {

			}

			return 10;
		} catch (ArithmeticException e) {
			return 20;
		} finally {
			System.out.println("不管程序是否出现错误，都执行");
			return 30;
		}

	}

}
