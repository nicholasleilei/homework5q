package 老师0723;

public class TestTeacher {
	public static final int a=10;
   public static void main(String[] args) {
	Teacher t1 = new BasicTeacher("张三",40);
	t1.teach();
	Teacher t2 = new WorkedTeacher("李四",35);
	t2.teach();
	/*
	 * 接口中的变量是常量：public static final
	 * 接口中的方法是抽象方法：public abstract(jdk1.8以前)
	 *   允许有被default 或者 static 修饰的方法（jdk1.8以后）
	 */
}
}
