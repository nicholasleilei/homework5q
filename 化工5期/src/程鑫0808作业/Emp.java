package ����0808��ҵ;

import java.io.Serializable;

public class Emp implements Serializable {
private String name;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

@Override
public String toString() {
	return "Emp [name=" + name + "]";
}

public Emp() {
	super();
	// TODO �Զ����ɵĹ��캯�����
}

public Emp(String name) {
	super();
	this.name = name;
}
}
