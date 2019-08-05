package ¸¶ºãöÎ0710;

public class Ã°ÅİÅÅĞò {
	public static void main(String[] args) {
	int []arr= {23,65,78,89,54,32};
	for(int i=1;i<arr.length;i++) {
		for(int j=0;j<arr.length-i;j++) {
			if(arr[j]>arr[j+1]) {
				int t=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=t;
						
			}
		}
	}
	for(int z:arr) {
		System.out.println(z+"\t");
	}
	}
	

}
