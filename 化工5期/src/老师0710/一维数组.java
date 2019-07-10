package 老师0710;

public class 一维数组 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
          int[] arr;//声明
          int ar1r[];//lao
          int[] arr1 = new int[10];//初始化
          arr1[0]=10;//下标，从0开始，到长度-1
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
          //当知道循环次数的时候 使用for循环
          //不知道循环次数 使用while
	}

}
