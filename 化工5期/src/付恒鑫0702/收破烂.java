package ������0702;

public class ������ {

	public static void main(String[] args) {
		// ����1000ƿ��ˮ��ÿ�κ���һƿ��õ�һ����ƿ�ӣ�ÿ������ƿ�����ܻ�һƿ��ˮ
//		          �ȵ��Ժ����ܵõ�һ����ƿ�ӣ����ܹ��ܺȶ���ƿ��ˮ�����ʣ����ٸ���ƿ��
		int qi=0, kong=0;
		for(int i=1000;i>=0;i--) {kong++;
			if(kong%3==0) {
				i++;kong-=3;
			}qi++;
		}System.out.println(kong+"����ƿ"+qi+"ƿ��ˮ");
	}

}
