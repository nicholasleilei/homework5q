package 老师0717;

public class Family {
	int sum=0;
   public int  comein(OldMan[] o) {
	   for(OldMan oo:o) {
		   if(oo.getAge()>65) {
			   if(oo.getSex().equals("男")) {
				   sum+=1000;
				   System.out.println(oo.getName()+" "+oo.getSex()+" "+oo.getAge()+"岁可以入院，缴费1000");
			   }else {
				   sum+=800; 
				   System.out.println(oo.getName()+" "+oo.getSex()+" "+oo.getAge()+"岁可以入院，缴费800");
			   }
		   }else {
			   System.out.println(oo.getName()+" "+oo.getSex()+" "+oo.getAge()+"不可以入院"); 
		   }
		   
	   }
	   return sum;
   }
}
