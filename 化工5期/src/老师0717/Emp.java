package ��ʦ0717;

public class Emp {
    private String name;
    private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public Emp(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public Emp() {
	}

	public String toString() {
		return "Emp [name=" + name + ", age=" + age + "]";
	}
//	2�����ɹ���Ա���������ѧ������������������֤�Ƕ������֤�������䳬��18�����������
//    ����һ��ѧ�������������Ƿ�������
	/*
	 * ����Ա��  ���ԣ�����    ���������
	 * ѧ����     ���ԣ�����  ���֤���� ����   
	 * ������    �������󲢳�ʼ��  ��ֵ ����
	 */

}
