package ������0717;

public class olidmanfamily {
	
	public int comein(oldman o) {
		int sum=0;
		if(o.getAge()>65&&o.getSex().equals("��")) {
			System.out.println(o.getName()+o.getSex()+o.getAge()+"�꽻1000Ԫ");
		sum+=1000;}
		else if(o.getAge()>65&&o.getSex().equals("Ů")) {
			System.out.println(o.getName()+o.getSex()+o.getAge()+"�꽻800Ԫ");
		sum+=800;}
		else {
			System.out.println(o.getName()+o.getAge()+"�겻�ý�Ǯ��û�е�65����");
	}return sum;	
		
			
	
	}


}
