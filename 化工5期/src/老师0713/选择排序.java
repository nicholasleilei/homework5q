package ¿œ ¶0713;

public class —°‘Ò≈≈–Ú {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             int[] arr= {23,78,0,4,-5};
             
             for(int i=0;i<arr.length-1;i++) {
            	 int min=i;
            	 for(int j=min+1;j<arr.length;j++) {
            		 if(arr[min]>arr[j]) {
            			 min=j;
            		 }
            	 }
            	 if(min!=i) {
            		 int t=arr[i];
            		 arr[i]=arr[min];
            		 arr[min]=t;
            	 }
            	 
             }
             
		/*
		 * for(int i=0;i<arr.length-1;i++) { for(int j=0;j<arr.length-1-i;j++) {
		 * if(arr[j]<arr[j+1]) { int t=arr[j]; arr[j]=arr[j+1]; arr[j+1]=t; } } }
		 */
             
             
	for(int i:arr) {
		System.out.print(i+" ");
	}
             }
}
