package ��ʦ0805;

public class ��ҵ06 {

	public static void main(String[] args) {
		/*
		 * 2��У��QQ���룬Ҫ��1.������5-15λ����  2.������0��ͷ
�������Ҫ�������¼�ɹ� ���������Ӧ����ʾ
		 */
		String qq="02";
		 boolean f =true;
		if(qq.length()<5||qq.length()>15) {
			f=false;
			System.out.println("qq����ĳ���Ӧ��Ϊ5-15֮��");
		}
		if(qq.startsWith("0")) {
			f=false;
			System.out.println("������0��ͷ");
		}
		
		if(f) {
			System.out.println("��¼�ɹ�");
		}else {
			System.out.println("��¼ʧ��");
		}

	}

}
