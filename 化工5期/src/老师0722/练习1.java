package 老师0722;

public class 练习1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 2、不同地方饮食文化不同，南方人爱吃米饭炒菜 喜欢经商，
		 * 北方人喜欢吃馒头吃炖菜 喜欢研究 使用多态测试成员变量，成员方法
		 * 多态后，使用向下转型，试一试有无问题
		 * 
		 *     人   name 吃  喜欢  
		 * 南方人
		 * 北方人
		 */
		
		Person p = new Nanfang("南方人");
		p.eat("米饭炒菜");
		p.like("经商");
		Person p1 = new BeiFang("北方人");
		p1.eat("馒头炖菜");
		p1.like("研究");
		
		Nanfang n = (Nanfang)p;
		n.eat("米饭炒菜1");
		n.like("经商2");
		
		
	}

}
