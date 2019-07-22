package 刘怡东0717;

public class 老师点名 {
public void check(学生点名[] a) {
	for(学生点名 b:a) {
		if(b.age<=18) {
			System.out.println(b.name+"答有");
		}else {System.out.println(b.name+"答到");}
	}
}
}
