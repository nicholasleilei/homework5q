package 刘怡东0806;

import java.util.Set;
import java.util.TreeSet;

public class Set接口作业 {
//	8、编写职工管理程序，某单位为对所有职工的基本信息（职工号、姓名、性别、工资）进行管理，
//	包括按照工资排序，根据姓名查找职工，删除职工信息（要求将这三个功能分别写成方法后调用）
	public static void main(String[] args) {
		Set<职工> s=new TreeSet<>(new Mycom());
		s.add(new 职工("张三", "男", 6000,30,101));  
		s.add(new 职工("李四", "男",6000, 20, 201));  
		s.add(new 职工("王五", "男", 7000, 50, 301));  
		s.add(new 职工("赵六", "女", 3000, 20, 400));  
		s.add(new 职工("孙七", "女", 6000, 30, 500));
		for(职工 i:s) {System.out.println(i);}
		
	}
}
