package ��ʦ0722;

public class ��ϰ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 2����ͬ�ط���ʳ�Ļ���ͬ���Ϸ��˰����׷����� ϲ�����̣�
		 * ������ϲ������ͷ������ ϲ���о� ʹ�ö�̬���Գ�Ա��������Ա����
		 * ��̬��ʹ������ת�ͣ���һ����������
		 * 
		 *     ��   name ��  ϲ��  
		 * �Ϸ���
		 * ������
		 */
		
		Person p = new Nanfang("�Ϸ���");
		p.eat("�׷�����");
		p.like("����");
		Person p1 = new BeiFang("������");
		p1.eat("��ͷ����");
		p1.like("�о�");
		
		Nanfang n = (Nanfang)p;
		n.eat("�׷�����1");
		n.like("����2");
		
		
	}

}
