package 刘怡东0717;

public class 主持人 {
public void check(全城热恋[] qs) {
	for(全城热恋 q:qs) {
		if(q.age<=25) {System.out.println("牵手成功");}
		if(q.age>25&&q.age<=50) {System.out.println("进入大龄组，祝你成功");}
		if(q.age>50) {System.out.println("灭灯");}
	}
}
}
