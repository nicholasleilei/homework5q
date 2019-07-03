package 刘怡东0702;

public class 鸡兔同笼 {
	public static void main(String[] args) {
		y:  for (int tu = 0; tu < 999; tu++) {
			for (int ji = 0;ji < 999; ji++) {
				if (4 * tu + 2 * ji == 94 && tu + ji == 35) {
					System.out.print("鸡的数目是");
					System.out.println(ji);
					System.out.print("兔子的数目是");
					System.out.println(tu);break y;
				}
				
			}

		}

	}
}

