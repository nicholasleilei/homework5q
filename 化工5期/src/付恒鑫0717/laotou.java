package 付恒鑫0717;

public class laotou {
public static void check(renxizao r) {
	if(r.getSex().equals("男")) {
		System.out.println(r.getName()+"不能洗澡");
	}else if(r.getSex().equals("女")){
		System.out.println(r.getName()+"可以洗澡");
	}
}
}
