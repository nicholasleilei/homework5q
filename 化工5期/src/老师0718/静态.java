package ��ʦ0718;

public class ��̬ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ��static ���εı���������̬���� Ҳ���������
		 * ���÷�ʽ�� ����.������(�Ƽ�)
		 *                     ������.������
		 *                     
		 *  ��static ���εķ���������̬���� Ҳ�����෽��
		 * ���÷�ʽ�� ����.������(�Ƽ�)
		 *                     ������.������
		 *                     
		 *  ��static ���εķ�����ֻ��ʹ�ñ�static���εı��������ñ�static���εķ���                                      
		 * û��static ���εķ���ɶ������     
		 * 
		 *  1.дһ�������ܹ�ͳ�Ƶ�ǰ��һ�������˶��ٸ�����
		 */
         Person p = new Person();
         Person.firstname="�Ϲ�";
         p.lastname="��";
         
         
         Person p1 = new Person();
         
         p1.lastname="�Ʒ�";
         
         Person p2 = new Person();
      
         p2.lastname="���";
         
       Person.showName();
	}

}
