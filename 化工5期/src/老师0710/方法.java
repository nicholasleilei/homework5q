package ��ʦ0710;

public class ���� {
	//����ĸСд �ӵڶ�����ĸ��ʼ����ĸ��д
    public static  void doSum(int c,int d) {//ռλ �����β�
    	System.out.println(d+c);
    }
	public static void main(String[] a) {
		// TODO Auto-generated method stub
      doSum(3,6);//ʵ��    //ֱ�ӵ���
      
      System.out.println(doAdd(4, 5));//�������
      
      int sum =doAdd(6, 2);//��ֵ����
      System.out.println(sum+10);
	}
	
	public static int doAdd(int a,int b) {
		return a+b;
	}
	

}
