package 刘怡东0717;



public class 管理员 {
	String name;
	public 管理员(String name){this.name=name;}
	public void jiancha(学生上网[] a ) {
		for(学生上网 st : a) {
		if(st.age>=18&&st.gettype()==2) {
			System.out.println("可以上网");
		}else System.out.println("不能上网");
	}}
}
