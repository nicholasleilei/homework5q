package ÀÏÊ¦0710;

public class ÄæĞò {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int[] arr= {11,22,33,44,55};
          for(int i=0;i<arr.length/2;i++) {
        	  int t=arr[i];
        	  arr[i]=arr[arr.length-1-i];
        	  arr[arr.length-1-i]=t;
          }
          
          for(int i:arr) {
        	  System.out.print(i+"\t");
          }
	}

}
