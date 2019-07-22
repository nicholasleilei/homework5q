package 刘怡东0718;

import 刘怡东0718.student;
import 刘怡东0718.熊猫;
import 刘怡东0718.老鼠;

public class 继承 {
	public static void main(String[] args) {
		student a = new student("张三", "男", 18);
		a.showid();
		a.showage();
		a.showstudy("JAVA");
		student b = new student("李四", "女");
		b.showid();
		b.showeat();
		b.showstudy("语文");
		student c = new student("王五", "男");
		c.showid();
		c.showsleep();
		new 老鼠();
		new 熊猫();

	}
}
