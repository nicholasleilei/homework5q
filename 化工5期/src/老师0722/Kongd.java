package 老师0722;

public class Kongd {
	/*
	 * 1、孔子爹:年龄40 教Java 
	 * 孔子： 年龄20   教论语      玩英雄联盟
	 *  在测试类中，
	 * 使用多态测试成员变量，成员方法
   * 
	 * 父类：孔子爹 name  age  teach
	 * 子类：孔子    name  age  teach  play   
	 */
 String name ="孔子爹"; 
 int age=40;

	
	
	public void teach() {
		System.out.println(age+"岁的"+name+"教java");
	}
}
