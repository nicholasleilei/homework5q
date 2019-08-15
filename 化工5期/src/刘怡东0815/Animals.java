package Áõâù¶«0815;

public class Animals {
	private int ID;
	private String Name,Kind;
	private int Number;
	private String Address;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getKind() {
		return Kind;
	}
	public void setKind(String Kind) {
		Kind = Kind;
	}
	public int getNumber() {
		return Number;
	}
	public void setNumber(int number) {
		Number = number;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public Animals() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Animals [ID=" + ID + ", Name=" + Name + ", Kind=" + Kind + ", Number=" + Number + ", Address=" + Address
				+ "]";
	}
}
