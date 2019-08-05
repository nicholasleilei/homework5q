package ¸¶ºãöÎ0710;

public class Ñ¡ÔñÅÅĞò {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []arr{23,56,45,78,89,13};
for(int i=0;i<arr.length-1;i++) {int min=i;
	for(int j=min=+1;j<arr.length;j++) {
		if(arr[min]>arr[j]) {
			min=j;
		}
		
	}if(min!=i) {
		int t=arr[i];
		arr[i]=arr[min];
		arr[min]=t;
		
	}
}
for(int num:arr) {
	System.out.println(num+" ");
}
	}

}
