package 老师0718;

public class 静态 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 被static 修饰的变量叫做静态变量 也叫做类变量
		 * 调用方式： 类名.变量名(推荐)
		 *                     对象名.变量名
		 *                     
		 *  被static 修饰的方法叫做静态方法 也叫做类方法
		 * 调用方式： 类名.方法名(推荐)
		 *                     对象名.方法名
		 *                     
		 *  被static 修饰的方法中只能使用被static修饰的变量，调用被static修饰的方法                                      
		 * 没有static 修饰的方法啥都能用     
		 * 
		 *  1.写一个程序，能够统计当前类一共创建了多少个对象
		 */
         Person p = new Person();
         Person.firstname="上官";
         p.lastname="云";
         
         
         Person p1 = new Person();
         
         p1.lastname="云飞";
         
         Person p2 = new Person();
      
         p2.lastname="婉儿";
         
       Person.showName();
	}

}
