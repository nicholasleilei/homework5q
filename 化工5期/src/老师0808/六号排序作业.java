package ��ʦ0808;

import java.util.Set;
import java.util.TreeSet;

public class ����������ҵ {

	public static void main(String[] args) {
		/*
		 * 8����дְ���������ĳ��λΪ������ְ���Ļ�����Ϣ��ְ���š��������Ա𡢹��ʣ����й���
�������չ������򣬸�����������ְ����ɾ��ְ����Ϣ��Ҫ�����������ֱܷ�д�ɷ�������ã�
		 */
		
		Set<Emp> set = new TreeSet<>();
		set.add(new Emp(1,"����","n",3000.0));
		set.add(new Emp(2,"����","v",1000.0));
		set.add(new Emp(3,"����","n",6000.0));
		set.add(new Emp(4,"����","v",1000.0));
		
		for(Emp e:set) {
			System.out.println(e);
		}

	}

}
