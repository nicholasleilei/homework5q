package 老师0702;

public class 跳转 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * for(int i=1;i<=10;i++) { if(i==5) continue;//break;//跳出
		 * System.out.println(i); }
		 */
		
		a: for(int i=1;i<=9;i++) {//控制行
	      	  for(int j=1;j<=i;j++) {//控制列
	      		  if(i==5)
	      			  continue a;
	      		System.out.print(j+"*"+i+"="+(i*j)+"\t"); 
	      	  }
	      	  System.out.println();
	      }
	}

}
