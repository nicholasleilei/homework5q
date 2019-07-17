package 老师0717;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 为对象的属性赋值的方法：
		 * 1.对象名.属性名
		 * 2.构造方法
		 * 3.setXxx方法
		 */
            Manager m = new Manager("张三");
            Student s1 = new Student("李四","二代",19);
            Student s2 = new Student("王五","一代",29);
            Student s3 = new Student("赵六","二代",11);
            Student s4 = new Student("刘七","二代",29);
          Student[] stus = {s1,s2,s3,s4};
            m.check(stus);
	}

}
