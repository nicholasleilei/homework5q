package ��ʦ0718;

public class Person {
   static String firstname;
   static String lastname;
   
   static {
	   System.out.println("���Ǿ�̬�飬�ڹ��췽��ִ��֮ǰ��ִ��һ�Σ�����ִֻ��һ��");
   }
   public Person() {
	   System.out.println("�����޲εĹ��췽�����ڴ��������ʱ��ᱻĬ�ϵĵ���");
   }
    public static void showName() {
    	System.out.println(firstname+" "+lastname);
    	
    }
    public  void showName1() {
    	System.out.println(firstname+" "+lastname);
    	showName();
    }
	
    
}
