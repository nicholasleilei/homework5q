package 老师0808;

import java.util.Set;
import java.util.TreeSet;

public class 六号排序作业 {

	public static void main(String[] args) {
		/*
		 * 8、编写职工管理程序，某单位为对所有职工的基本信息（职工号、姓名、性别、工资）进行管理，
包括按照工资排序，根据姓名查找职工，删除职工信息（要求将这三个功能分别写成方法后调用）
		 */
		
		Set<Emp> set = new TreeSet<>();
		set.add(new Emp(1,"张三","n",3000.0));
		set.add(new Emp(2,"李四","v",1000.0));
		set.add(new Emp(3,"王五","n",6000.0));
		set.add(new Emp(4,"赵六","v",1000.0));
		
		for(Emp e:set) {
			System.out.println(e);
		}

	}

}
