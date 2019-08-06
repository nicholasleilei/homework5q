package 程鑫0717作业;

public class Zhuchi {
String name;

public Zhuchi(String name) {
	super();
	this.name = name;
}

public Zhuchi() {
	super();
	// TODO 自动生成的构造函数存根
}
public void light(Danshen[] c) {
    for(Danshen st:c)
	if(st.x=="女"&&st.age<25) {
		System.out.println("牵手成功");
	}else if(st.x=="女"&&st.age>25&&st.age<50) {
		System.out.println("祝你成功");
	}else {
		System.out.println("灭灯");
	}
}
}
