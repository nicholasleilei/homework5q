package ��ʦ0710;

public class һά���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
          int[] arr;//����
          int ar1r[];//lao
          int[] arr1 = new int[10];//��ʼ��
          arr1[0]=10;//�±꣬��0��ʼ��������-1
          arr1[1]=20;
          
          
          System.out.println(arr1[9]);
          System.out.println(arr1.length);
          int[] arr2= {2,5,7,9,9};
          
          for(int i=0;i<arr2.length;i++) {
        	  System.out.println(arr2[i]);
          }
          int sum=0;
          for(int i:arr2) {//for-each  
        	  System.out.println(i);
        	  sum+=i;
          }
          System.out.println(sum);
          //��֪��ѭ��������ʱ�� ʹ��forѭ��
          //��֪��ѭ������ ʹ��while
	}

}
