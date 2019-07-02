package 老师0625;

public class 五个一行 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		int count=0;
		while(i<=100) {
			if(i%6==0) {
				System.out.print(i+"\t");
				count++;
				if(count%5==0) {
					System.out.println();
				}
			}
			
			i++;
		}

	}

}
