package ��ʦ0702;

public class ��ת {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * for(int i=1;i<=10;i++) { if(i==5) continue;//break;//����
		 * System.out.println(i); }
		 */
		
		a: for(int i=1;i<=9;i++) {//������
	      	  for(int j=1;j<=i;j++) {//������
	      		  if(i==5)
	      			  continue a;
	      		System.out.print(j+"*"+i+"="+(i*j)+"\t"); 
	      	  }
	      	  System.out.println();
	      }
	}

}
