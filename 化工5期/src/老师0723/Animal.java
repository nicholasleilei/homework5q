package ��ʦ0723;

public abstract class Animal {
	//���һ�����а������󷽷� ��ô�����һ���ǳ�����
	//���ǳ������У�����һ��ֻ�������󷽷�
    private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    public abstract void eat();
    public void sleep() {
    	System.out.println("˯");
    }
}
