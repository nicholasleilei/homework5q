package ��ʦ0806;

import java.util.Set;
import java.util.TreeSet;

public class ��ҵ01 {

	public static void main(String[] args) {
		/*
		 * 3���������ѧ���������������ĳɼ�����ѧ�ɼ���Ӣ��ɼ���
                                              ����set����
                                4�������ֵܷĴӸߵ��ͽ�ѧ�����������ܷ����������̨  
		 */
		Student s1 = new Student("����",98.6,34.6,99.2);
		Student s2 = new Student("��˹",55.9,69.8,36.2);
		Student s3 = new Student("����",56.6,89.6,56.2);
		Student s4 = new Student("����",77.6,89.6,39.2);
		Student s5 = new Student("����",93.6,62.6,49.2);
		
		Set<Student> stus = new TreeSet<>(new MyComp());
		stus.add(s1);
		stus.add(s2);
		stus.add(s3);
		stus.add(s4);
		stus.add(s5);
		
		for(Student s:stus) {
			System.out.println(s);
		}

	}

}
