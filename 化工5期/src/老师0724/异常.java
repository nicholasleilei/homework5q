package ��ʦ0724;

public class �쳣 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1.����û��catch
		// 2.����û��finally
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
			System.out.println("���ܳ����Ƿ���ִ��󣬶�ִ��");
			return 30;
		}

	}

}
