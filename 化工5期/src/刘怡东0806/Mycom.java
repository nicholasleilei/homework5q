package 刘怡东0806;

import java.util.Comparator;

public class Mycom implements Comparator<职工>{

	@Override
	public int compare(职工 o1, 职工 o2) {
		// TODO Auto-generated method stub
		return o1.getMoney().compareTo(o2.getMoney()+1);
	}
	

}
