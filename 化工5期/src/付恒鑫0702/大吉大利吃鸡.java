package ������0702;

public class �󼪴����Լ� {

	public static void main(String[] args) {
		// ÿֻĸ��3ԪǮ��ÿֻ����5ԪǮ����ֻһ��Ǯ�������100Ԫ��100ֻ������Щ����
		int sum=0;
		double x=3.0,y=5.0,z=1/3;
		for(int i=1;i<=100;i++) {
			for(int j=1;j<=100;j++) {
				for(int n=1;n<=100;n++) {
					if(3*i+5*j+1/3*n==100&&i+j+n==100) {sum++;
						System.out.println(i+"ֻĸ��"+j+"ֻ����"+n+"ֻС��");
						break;
					}
					
				}
			}
		}
		System.out.println(sum+"�ֿ���");	
	}

}
