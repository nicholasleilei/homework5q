package ��ʦ0805;

public class ��ҵ02 {

	public static void main(String[] args) {
		/*
		 * 1���������0-9A-Za-z��4λ��֤��
   �Ӽ��̽����û�¼�����֤���������֤�����Ƚ�
   �����ȣ������Ǵ�Сд���������֤�ɹ� ������������֤���������
		 */
		String str="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZqwertyuioplkjhgfdsazxcvbnm";
		String code="";
		for(int i=0;i<4;i++) {
			int a=(int)(Math.random()*(str.length()));
			code+=str.charAt(a);
		}
System.out.println(code);
	}

}
