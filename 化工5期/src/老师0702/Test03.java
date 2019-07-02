package 老师0702;

public class Test03 {

	public static void main(String[] args) {
		//// 9.打印矩形，直角三角形，倒直角三角形，平行四边形，等腰三角形
        
		/*
		 * for(int i=1;i<=6;i++) {//控制行 for(int j=1;j<=8;j++) {//控制列
		 * System.out.print("*"); } System.out.println(); }
		 */
        
        for(int i=1;i<=9;i++) {//控制行
      	  for(int j=1;j<=i;j++) {//控制列
      		System.out.print(j+"*"+i+"="+(i*j)+"\t");  
      	  }
      	  System.out.println();
      }
		
//        *
//        **
//        ***
//        ****
//        ……
        
     
	}

}
