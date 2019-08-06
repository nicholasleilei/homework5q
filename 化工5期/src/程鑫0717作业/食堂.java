package 程鑫0717作业;

public class 食堂 {
public static void main(String[] args) {
  Ayi t=new Ayi("王姨");
   Fantong s1=new Fantong("小明","男");
   Fantong s2=new Fantong("小芳","女");
   Fantong s3=new Fantong("小花","女");
   Fantong s4=new Fantong("小晓","男");
   Fantong s5=new Fantong("小强","男");
   Fantong[] sb= {s1,s2,s3,s4,s5};
   t.dafan(sb);
   System.out.println(t.sum);
}
}
