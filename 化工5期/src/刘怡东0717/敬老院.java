package 刘怡东0717;

public class 敬老院 {
int sum=0;
public void money(敬老院老人[] a) {
	for(敬老院老人 j:a) {
		if(j.age>=65) {
			System.out.println(j.name+"可以入住");
		 if(j.sex=="男") {sum+=1000;}else sum+=800;
		}else System.out.println(j.name+"不可以入住");
	}
	System.out.println("总计"+sum+"元");
}
}
