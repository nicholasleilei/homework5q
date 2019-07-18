package 老师0718;

public class BMW extends Car{

public void autoDrive() {
	System.out.println(getColor()+"的"+getBrand()+"车开启自动驾驶系统");
}
//构造方法不能继承，只能调用 super 并且只能在构造方法的第一行
public BMW(String b,String c) {
      super(b,c);
}
}
