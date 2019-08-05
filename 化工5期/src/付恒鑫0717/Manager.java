package 付恒鑫0717;

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
	if(s.getAge()>18&&s.getType().equals("二代")) {
		System.out.println(s.getName()+"可以上网");
		
	}else {
		System.out.println(s.getName()+"不可以上网");
	}
	
}
}
