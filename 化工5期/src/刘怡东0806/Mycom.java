package ������0806;

import java.util.Comparator;

public class Mycom implements Comparator<ְ��>{

	@Override
	public int compare(ְ�� o1, ְ�� o2) {
		// TODO Auto-generated method stub
		return o1.getMoney().compareTo(o2.getMoney()+1);
	}
	

}
