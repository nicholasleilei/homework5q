package ��ʦ0722;

public class Person {
   private String name;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Person(String name) {
	super();
	this.name = name;
}
   
   public void eat(String food) {
	   System.out.println(name+"ϲ����"+food);
   }
   public void like(String some) {
	   System.out.println(name+"ϲ��"+some);
   }
}
