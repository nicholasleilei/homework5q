package ������0717;

public class Manager {
private String name;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Manager(String name) {
	super();
	this.name = name;
}
public void check(student s){
	if(s.getAge()>18&&s.getType().equals("����")) {
		System.out.println(s.getName()+"��������");
		
	}else {
		System.out.println(s.getName()+"����������");
	}
	
}
}
