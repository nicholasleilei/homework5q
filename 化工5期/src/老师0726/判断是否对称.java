package ��ʦ0726;

public class �ж��Ƿ�Գ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2. ʹ��stringbuffer���еķ�������ж��ַ����Ƿ�Գ�
		String str= "abcba";
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		System.out.println(str.equals(sb.toString())?"�Գ�":"���Գ�");
	}

}
