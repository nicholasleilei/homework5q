package ��ʦ0713;

public class Student {//����
   String name;//����
   String sex;
   int age;
   public void study() {//����
	   if(age>18) {
		   System.out.println(name+age+"�겻��ѧϰ");
	   }else {
		   System.out.println(name+age+"�����ѧϰ");
	   }
   }
   public void play() {
	   if(sex.equals("��")) {
		   System.out.println(name+"������");
	   }else {
		   System.out.println(name+"������");
	   }
	  
   }
}
