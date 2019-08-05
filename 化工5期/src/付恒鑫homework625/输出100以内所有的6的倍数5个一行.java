package 付恒鑫homework625;

public class 输出100以内所有的6的倍数5个一行 {

	public static void main(String[] args) {
		// 输出100以内所有的6的倍数，5个一行
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
