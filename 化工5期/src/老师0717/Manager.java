package ��ʦ0717;

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
		if(stu.getAge()>=18 && stu.getType().equals("����")) {
			System.out.println(stu.getName()+"��������");
		}else {
			System.out.println(stu.getName()+"����������");
			
		}
	}
	
}
}
