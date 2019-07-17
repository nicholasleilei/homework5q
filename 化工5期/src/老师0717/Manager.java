package 老师0717;

public class Manager {
   private String name;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Manager(String name) {
	this.name = name;
}
  
public void check(Student[] stus) {
	
	for(Student stu:stus) {
		if(stu.getAge()>=18 && stu.getType().equals("二代")) {
			System.out.println(stu.getName()+"可以上网");
		}else {
			System.out.println(stu.getName()+"不可以上网");
			
		}
	}
	
}
}
