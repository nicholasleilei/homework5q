package ������0805;

public class Cat {
private String name,color;

@Override
public String toString() {
	return "Cat [name=" + name + ", color=" + color + "]";
}

public Cat(String name, String color) {
	super();
	this.name = name;
	this.color = color;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}
}
