package 老师0808;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 六号作业02 {

	public static void main(String[] args) {
		/*
		 * 7.模拟斗地主洗牌发牌
 （1）创建一副牌
  （2）向牌中放牌
   （3）洗牌、发牌、看牌
		 */
     String[] color= {"♥","♦","♠","♣"};
     String[] nums = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
     List<String> pai = new ArrayList<>();
     for(String s:color) {
    	 for(String n:nums) {
    		 pai.add(s+n);
    	 }
     }
     
     pai.add("☀");
     pai.add("☽");
     
     System.out.println(pai);
     Collections.shuffle(pai);
     System.out.println(pai);
     List<String> di = new ArrayList<>();
     List<String> p1 = new ArrayList<>();
     List<String> p2 = new ArrayList<>();
     List<String> p3 = new ArrayList<>();
     
     //
		/*方式一：每人一次发17张
		 * for(int i=0;i<17;i++) { p1.add(pai.get(i)); }
		 * System.out.println("玩家1的牌："+p1); pai.removeAll(p1); for(int i=0;i<17;i++) {
		 * p2.add(pai.get(i)); } System.out.println("玩家2的牌："+p2); pai.removeAll(p2);
		 * 
		 * for(int i=0;i<17;i++) { p3.add(pai.get(i)); }
		 * System.out.println("玩家3的牌："+p3); pai.removeAll(p3);
		 * 
		 * di.addAll(pai); System.out.println("底牌："+di);
		 */
     
     //方式二：一人一人发
     
     for(int i=0;i<pai.size()-3;i++) {
    	 if(i%3==1) {
    		 p1.add(pai.get(i));
    	 }else if(i%3==2) {
    		 p2.add(pai.get(i));
    	 }else {
    		 p3.add(pai.get(i));
    	 }
     }
     
     System.out.println(p1);
     System.out.println(p2);
     System.out.println(p3);
     pai.removeAll(p1);
     pai.removeAll(p2);
     pai.removeAll(p3);
     di.addAll(pai);
     System.out.println(di);
	}

}
