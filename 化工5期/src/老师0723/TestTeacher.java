package ��ʦ0723;

public class TestTeacher {
	public static final int a=10;
   public static void main(String[] args) {
	Teacher t1 = new BasicTeacher("����",40);
	t1.teach();
	Teacher t2 = new WorkedTeacher("����",35);
	t2.teach();
	/*
	 * �ӿ��еı����ǳ�����public static final
	 * �ӿ��еķ����ǳ��󷽷���public abstract(jdk1.8��ǰ)
	 *   �����б�default ���� static ���εķ�����jdk1.8�Ժ�
	 */
}
}
