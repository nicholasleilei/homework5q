package ������0718;

public class panda extends animal{
	public panda (String name ) {
		super (name);
		
			
		}
	 public void eat(String thing,animal a) {
			System.out.println(a.getName()+"��"+thing);
	}
	 public void dosome(String something,animal a) {
		 System.out.println(a.getName()+something);
	 }
}
