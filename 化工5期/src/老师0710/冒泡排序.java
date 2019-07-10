package 老师0710;

public class 冒泡排序 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int[] arr = {23,56,0,33,78,-200};
         for(int i=0;i<arr.length-1;i++){//控制轮数
        	    for(int j=0;j<arr.length-1-i;j++){//每轮比较的次数
        	        if(arr[j] >arr[j+1]){
        	            int t=arr[j];
        	            arr[j]=arr[j+1];
        	            arr[j+1]=t;
        	        }
        	   }
   }
         
         for(int i:arr) {
        	 System.out.print(i+" ");
         }
	}

}
