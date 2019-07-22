package 刘怡东0717;

public class 食堂阿姨 {
public void feed(学生打饭[] a) {
	int sum=0;
	for(学生打饭 b :a) {
		if(b.getSex()=="男") {
			sum+=4;
		}else sum+=2;
	}
	System.out.println("一共打了"+sum+"两饭");
}
}
