package ����0717��ҵ;

public class Zhuchi {
String name;

public Zhuchi(String name) {
	super();
	this.name = name;
}

public Zhuchi() {
	super();
	// TODO �Զ����ɵĹ��캯�����
}
public void light(Danshen[] c) {
    for(Danshen st:c)
	if(st.x=="Ů"&&st.age<25) {
		System.out.println("ǣ�ֳɹ�");
	}else if(st.x=="Ů"&&st.age>25&&st.age<50) {
		System.out.println("ף��ɹ�");
	}else {
		System.out.println("���");
	}
}
}
