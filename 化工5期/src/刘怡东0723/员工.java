package ������0723;

public abstract class Ա�� {
	private String name;
	private int number;

	public abstract void work();
	public abstract int earn();
	public String getName() {
		return name;
	}

	public Ա��(String name, int number) {
		super();
		this.name = name;
		this.number = number;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	
}
