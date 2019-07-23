package 付恒鑫0702;

public class 倒直角三角形 {

	public static void main(String[] args) {
		// 倒直角三角形
//		for(int i=1;i<=7;i++) {
//			for(int j=7;j>=i;j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//
////		             直角三角形
//		for(int i=1;i<=7;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		等腰直角三角形
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j>=i;j++) {
//				System.out.print(" * ");
//			}System.out.println();
//		倒直角三角形
		for(int i=1;i<=5;i++){
			   for(int j=1;j<=5-i;j++){
				   System.out.print(" ");
			   }
			   for(int k=1;k<=i;k++){
				   System.out.print("*");
			   }
			   System.out.println();
		   }

	}
		
	}

//}
