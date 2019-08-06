package 程鑫0717作业;

public class Guanliyuan {
String name;
public  Guanliyuan(String name) {
	this.name=name;}
public void shangji(Shangwang[]a) {
	for(Shangwang st:a) {
		if(st.age>=18&&st.getType()==2) {
			System.out.println(st.getName()+st.getAge()+"岁"+"可以上网");
		}else System.out.println(st.getName()+st.getAge()+"岁"+"不能上网");
	}
}

}
