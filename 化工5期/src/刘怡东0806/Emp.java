package ������0806;

public class Emp {
//	4���洢���Ա����Ϣ���������ţ����������䣬��ְʱ�䣬������ӡ����Ա�������������Ա��������
//	����Ա����ְʱ���Ա����Ϣ������Ա����ְʱ��ɾ������Ϣ��
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
