package 老师0713;

public class 二维数组 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            int[][] arr =new int[5][3];
            int[][] arr1 = {{22,66,44},{77,33,88},{25,45,65},{11,66,99}};
            
            for(int i=0;i<arr1.length;i++) {
            	for(int j=0;j<arr1[i].length;j++) {
            		System.out.print(arr1[i][j]+" ");
            	}
            	System.out.println();
            }
            int sum=0;
            for(int[] i:arr1) {
            	for(int j:i) {
            		sum+=j;
            	}
            }
            System.out.println(sum);
	}

}
