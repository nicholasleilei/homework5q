package 老师0717;

public class Emp {
    private String name;
    private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public Emp(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public Emp() {
	}

	public String toString() {
		return "Emp [name=" + name + ", age=" + age + "]";
	}
//	2、网吧管理员张三，检查学生李四上网，如果身份证是二代身份证并且年龄超过18岁则可以上网
//    定义一组学生来上网，看是否能上网
	/*
	 * 管理员类  属性：姓名    方法：检查
	 * 学生类     属性：姓名  身份证类型 年龄   
	 * 测试类    创建对象并初始化  赋值 调用
	 */

}
