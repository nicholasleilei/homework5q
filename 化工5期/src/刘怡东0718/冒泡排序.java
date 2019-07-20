package Áõâù¶«0718;

public class Ã°ÅİÅÅĞò {
	public static void main(String[] args) {
         int[] a = {2,3,4,54,3,543,24,2,42,25,5};
         for(int i=0;i<a.length-1;i++){
        	    for(int j=0;j<a.length-1-i;j++){
        	        if(a[j] >a[j+1]){
        	            int t=a[j];
        	            a[j]=a[j+1];
        	            a[j+1]=t;
        	        }
        	   }
   }
         
         for(int i:a) {
        	 System.out.print(i+" ");
         }
	}
}
