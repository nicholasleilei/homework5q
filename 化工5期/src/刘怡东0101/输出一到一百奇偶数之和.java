package ������0101;

public class ���һ��һ����ż��֮�� {
	public static void main(String[] args) {

		int i = 1;
		int a = 0, b = 0;
		while (i <= 100) {
			if (i% 2 == 0) {
				b += i;
			} else {
				a += i;
			}
			i++;
		}
		System.out.println(a + "������֮��");
		System.out.println(b + "��ż��֮��");
	}

}
