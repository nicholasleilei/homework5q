package ��ʦ0710;

public class ð������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int[] arr = {23,56,0,33,78,-200};
         for(int i=0;i<arr.length-1;i++){//��������
        	    for(int j=0;j<arr.length-1-i;j++){//ÿ�ֱȽϵĴ���
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
