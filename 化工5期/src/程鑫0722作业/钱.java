package 程鑫0722作业;

public class 钱 {
public static void main(String[] args) {
	Human h=new Man("小明",18);
	h.show();
	Man m=(Man)h;
    m.makeMoney();
}
}
