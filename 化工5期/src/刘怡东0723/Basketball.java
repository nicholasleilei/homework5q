package 刘怡东0723;

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
	System.out.println(name+"是篮球人不需要学习英语");
}

}
