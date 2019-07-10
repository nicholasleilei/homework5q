package 老师0710;

public class 取最值 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int[] arr = {23,78,-88,0,2};
         int max=arr[0];
         int min=arr[0];
         
         for(int i=0;i<arr.length;i++) {
        	if(max<arr[i]) {
        		max=arr[i];
        	}
        	if(min>arr[i]) {
        		min=arr[i];
        	}
         }
         System.out.println(max);
         System.out.println(min);
	}

}
