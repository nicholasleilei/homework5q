package 刘怡东0806;

public class Emp {
//	4、存储多个员工信息，包括工号，姓名，年龄，入职时间，逐条打印所有员工姓名，并输出员工个数。
//	当有员工入职时添加员工信息，当有员工离职时，删除该信息。
private String num,name,year,time;

public String getNum() {
	return num;
}

public void setNum(String num) {
	this.num = num;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getYear() {
	return year;
}

public void setYear(String year) {
	this.year = year;
}

public String getTime() {
	return time;
}

public void setTime(String time) {
	this.time = time;
}

public Emp(String num, String name, String year, String time) {
	super();
	this.num = num;
	this.name = name;
	this.year = year;
	this.time = time;
}



@Override
public String toString() {
	return "Emp [num=" + num + ", name=" + name + ", year=" + year + ", time=" + time + "]";
}

}
