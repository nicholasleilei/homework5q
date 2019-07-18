package 老师0718;

public class Peo {//地点  性别   | 吃  说   爱
    private String  city;
    private String sex;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Peo(String city, String sex) {
		super();
		this.city = city;
		this.sex = sex;
	}
	
    public Peo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void speak(String l) {
    	System.out.println(city+sex+"人说"+l);
    }
    public void eat(String f) {
    	System.out.println(city+sex+"人吃"+f);
    }
    public void love(String l) {
    	System.out.println(city+sex+"人爱"+l);
    }
   
}
