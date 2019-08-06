package 老师0806;

import java.util.Set;
import java.util.TreeSet;

public class 作业01 {

	public static void main(String[] args) {
		/*
		 * 3、创建五个学生对象（姓名、语文成绩、数学成绩、英语成绩）
                                              存入set集合
                                4、按照总分的从高到低将学生的姓名和总分输出到控制台  
		 */
		Student s1 = new Student("张三",98.6,34.6,99.2);
		Student s2 = new Student("里斯",55.9,69.8,36.2);
		Student s3 = new Student("王五",56.6,89.6,56.2);
		Student s4 = new Student("赵六",77.6,89.6,39.2);
		Student s5 = new Student("六七",93.6,62.6,49.2);
		
		Set<Student> stus = new TreeSet<>(new MyComp());
		stus.add(s1);
		stus.add(s2);
		stus.add(s3);
		stus.add(s4);
		stus.add(s5);
		
		for(Student s:stus) {
			System.out.println(s);
		}

	}

}
