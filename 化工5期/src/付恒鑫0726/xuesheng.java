package 付恒鑫0726;

import java.util.Set;
import java.util.TreeSet;

public class xuesheng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
student s=new student("张三",85.9,66.3,56.9);
student s1=new student("张4",63.9,76.3,86.9);
student s2=new student("张5",83.9,66.3,66.9);
student s3=new student("张6",53.9,86.3,76.9);
student s4=new student("张7",85.9,86.3,76.9);

Set<student>  stu=new TreeSet<>();
stu.add(s);
stu.add(s1);
stu.add(s2);
stu.add(s3);
stu.add(s4);

for(student stus:stu) {
	System.out.println(stus);
	
}

	}

}
