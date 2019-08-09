package 程鑫0808作业;

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
	// TODO 自动生成的构造函数存根
}

public Emp(String name) {
	super();
	this.name = name;
}
}
