package ��ʦ0702;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		 /*
		 * 10.����¼��QQ�ź�������е�¼�����QQ��349417084����������123456�� ��ʾ��ӭ�㣬
		 * ������ʾ�Բ���������������������룬
		 * ����������붼����ȷ����ʾQQ���Ѿ�����
		 */
       Scanner sc = new Scanner(System.in);
       
      for(int i=1;i<=3;i++) {
   
       System.out.println("���������룺");
       String pass= sc.next();
       
       if(qq.equals("666")&&pass.equals("666")) {
    	   System.out.println("��ӭ�㣡");
    	   break;
       }else {
    	   System.out.println("����������������룡");
       }
       if(i==3) {
    	   System.out.println("����");
       }
      }
	}

}
