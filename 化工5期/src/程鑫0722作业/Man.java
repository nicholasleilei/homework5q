package ����0722��ҵ;

public class Man extends Human{
public void useMoney() {
	System.out.println(getName()+"����"+getMoney());
}
public void makeMoney() {
	System.out.println(getName()+"��������"+getMoney()+"Ԫ");}
public Man() {
	super();
	// TODO �Զ����ɵĹ��캯�����
}

public Man(String name, int money) {
	super(name, money);
	// TODO �Զ����ɵĹ��캯�����
}
}
