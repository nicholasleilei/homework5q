package 付恒鑫0717;

public class olidmanfamily {
	
	public int comein(oldman o) {
		int sum=0;
		if(o.getAge()>65&&o.getSex().equals("男")) {
			System.out.println(o.getName()+o.getSex()+o.getAge()+"岁交1000元");
		sum+=1000;}
		else if(o.getAge()>65&&o.getSex().equals("女")) {
			System.out.println(o.getName()+o.getSex()+o.getAge()+"岁交800元");
		sum+=800;}
		else {
			System.out.println(o.getName()+o.getAge()+"岁不用交钱，没有到65周岁");
	}return sum;	
		
			
	
	}


}
