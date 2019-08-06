package 程鑫0717作业;
public class 网吧 {
	public static void main(String[] args) {
		Guanliyuan t=new Guanliyuan("张三");
		Shangwang s=new Shangwang("小明",18,1);
		Shangwang s1=new Shangwang("小花",20,2);
		Shangwang s2=new Shangwang("小芳",19,2);
		Shangwang s3=new Shangwang("李华",6,1);
		Shangwang s4=new Shangwang("李四",50,2);
		Shangwang s5=new Shangwang("王五",17,2);
		Shangwang[] sts= {s,s1,s2,s3,s4,s5,};
		t.shangji(sts);
}}
