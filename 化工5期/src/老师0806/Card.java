package ¿œ ¶0806;

public class Card {
   private String type;
   private String mess;
   private String date;
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getMess() {
	return mess;
}
public void setMess(String mess) {
	this.mess = mess;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public Card(String type, String mess, String date) {
	super();
	this.type = type;
	this.mess = mess;
	this.date = date;
}
public Card() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Card [type=" + type + ", mess=" + mess + ", date=" + date + "]";
}
   
}
