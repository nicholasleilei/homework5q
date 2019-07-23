package 老师0723;

public class TestAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Animal a = new Cat();
      a.setName("咪咪");
      a.eat();
      a.sleep();
      
      Animal b = new Dog();
      b.setName("小黑");
      b.eat();
      b.sleep();
      
     // Animal aa = new Animal();
      /*
       * 1、某学校老师分为两种：就业班老师和基础班老师，
       * 就业班老师教JavaEE 基础班老师教JavaSE
   将他们的共性抽离到父类中。
   使用抽象和多态的方式测试输出：张三，40岁，讲解JavaSE
                                                     李四，35岁，讲解JavaEE
    老师（抽象父类）：姓名，年龄，讲解抽象（）
  就业班老师，基础班老师：覆盖
  测试
       */
	}

}
