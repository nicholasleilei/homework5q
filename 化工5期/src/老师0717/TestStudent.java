package ��ʦ0717;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Ϊ��������Ը�ֵ�ķ�����
		 * 1.������.������
		 * 2.���췽��
		 * 3.setXxx����
		 */
            Manager m = new Manager("����");
            Student s1 = new Student("����","����",19);
            Student s2 = new Student("����","һ��",29);
            Student s3 = new Student("����","����",11);
            Student s4 = new Student("����","����",29);
          Student[] stus = {s1,s2,s3,s4};
            m.check(stus);
	}

}
