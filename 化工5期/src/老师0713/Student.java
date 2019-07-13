package 老师0713;

public class Student {//名词
   String name;//名词
   String sex;
   int age;
   public void study() {//动词
	   if(age>18) {
		   System.out.println(name+age+"岁不用学习");
	   }else {
		   System.out.println(name+age+"岁必须学习");
	   }
   }
   public void play() {
	   if(sex.equals("男")) {
		   System.out.println(name+"不能完");
	   }else {
		   System.out.println(name+"可以完");
	   }
	  
   }
}
