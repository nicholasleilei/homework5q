package ��ʦ0702;

public class Test03 {

	public static void main(String[] args) {
		//// 9.��ӡ���Σ�ֱ�������Σ���ֱ�������Σ�ƽ���ı��Σ�����������
        
		/*
		 * for(int i=1;i<=6;i++) {//������ for(int j=1;j<=8;j++) {//������
		 * System.out.print("*"); } System.out.println(); }
		 */
        
        for(int i=1;i<=9;i++) {//������
      	  for(int j=1;j<=i;j++) {//������
      		System.out.print(j+"*"+i+"="+(i*j)+"\t");  
      	  }
      	  System.out.println();
      }
		
//        *
//        **
//        ***
//        ****
//        ����
        
     
	}

}
