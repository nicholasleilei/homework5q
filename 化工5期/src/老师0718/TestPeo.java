package 老师0718;

public class TestPeo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Changchun cc = new Changchun("长春", "男");
          cc.speak("东北话");
          cc.setSex("女");
          cc.eat("大肉串");
          cc.setSex("");
          cc.love("滑冰");
          
          American a = new American("美国", "男");
          a.speak("鸟语");
          a.setSex("女");
          a.eat("西餐");
          a.setSex("");
          a.love("打拳击");
          
	}

}
