package ��ʦ0717;

public class Family {
	int sum=0;
   public int  comein(OldMan[] o) {
	   for(OldMan oo:o) {
		   if(oo.getAge()>65) {
			   if(oo.getSex().equals("��")) {
				   sum+=1000;
				   System.out.println(oo.getName()+" "+oo.getSex()+" "+oo.getAge()+"�������Ժ���ɷ�1000");
			   }else {
				   sum+=800; 
				   System.out.println(oo.getName()+" "+oo.getSex()+" "+oo.getAge()+"�������Ժ���ɷ�800");
			   }
		   }else {
			   System.out.println(oo.getName()+" "+oo.getSex()+" "+oo.getAge()+"��������Ժ"); 
		   }
		   
	   }
	   return sum;
   }
}
