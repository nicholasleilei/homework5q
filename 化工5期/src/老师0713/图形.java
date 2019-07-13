package ¿œ ¶0713;

public class Õº–Œ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            String[][] arr = new String[5][5];
            
            for(int i=0;i<arr.length;i++) {
            	for(int j=0;j<arr[i].length;j++) {
            		
            		if((i%2==0 && j%2==0)||(i%2==1 && j%2==1)) {
            			arr[i][j]="#";
            		}
            		if((i==0&&j==0)||(i==arr.length-1 && j==arr.length-1)){
            			arr[i][j]="@";
            	   }
            		if((i%2==1 && j%2==0)||(i%2==0 && j%2==1)){
            			arr[i][j]="*";
            	   }
                 }
            
	}
            
            for(String[] i:arr)
        	{
        		for (String j : i) {
        			System.out.print(j + " ");
        		}
        		System.out.println();
        	}     


}
}