package ������0806;

import java.util.Set;
import java.util.TreeSet;

public class Set�ӿ���ҵ {
//	8����дְ���������ĳ��λΪ������ְ���Ļ�����Ϣ��ְ���š��������Ա𡢹��ʣ����й���
//	�������չ������򣬸�����������ְ����ɾ��ְ����Ϣ��Ҫ�����������ֱܷ�д�ɷ�������ã�
	public static void main(String[] args) {
		Set<ְ��> s=new TreeSet<>(new Mycom());
		s.add(new ְ��("����", "��", 6000,30,101));  
		s.add(new ְ��("����", "��",6000, 20, 201));  
		s.add(new ְ��("����", "��", 7000, 50, 301));  
		s.add(new ְ��("����", "Ů", 3000, 20, 400));  
		s.add(new ְ��("����", "Ů", 6000, 30, 500));
		for(ְ�� i:s) {System.out.println(i);}
		
	}
}
