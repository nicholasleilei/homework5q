package ��ʦ0718;

public class Son extends Father{
	//int a=20;
	
	  public void show() {//�����г�����ͬ���෽���������Ͳ�������ͬ�ķ���������������д �򸲸�
	  System.out.println("����show"+super.a);
	  }
	 
	
	  public Son() {
		  this("332423");
		   System.out.println("�����޲εĹ��췽��");
	   }
	   public Son(String a) {
		   super("","");
		   System.out.println("������һ��String�εĹ��췽��");
	   }
	   public Son(String a,String b) {
		   System.out.println("����������string�Ĺ��췽��");
	   }
	   public Son(int a) {
		   System.out.println("������һ��int�Ĺ��췽��");
	   }
}
