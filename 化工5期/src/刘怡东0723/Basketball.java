package ������0723;

public abstract class Basketball {
String name;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Basketball(String name) {
	super();
	this.name = name;
	System.out.println(name+"�������˲���ҪѧϰӢ��");
}

}
