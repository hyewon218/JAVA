package test;
//부모클래스
public class Phone {
//개통날짜
	String day;
//고객이름	
	String customerName;
	int price;
	public Phone() {}
	public Phone(String name, String day) {
		this.customerName=name;
		this.day=day;
	}
	public String showInfo() {
		return "";
	}
	public int getPrice() {
		return price;
	}
}
class Iphone extends Phone{
	int price=16000;
	public Iphone() {
		super("유재석","2012-03-16");
	}
	public int getPrice() {
		return price;
	}
	public String showInfo() {
		return customerName+"고객이 아이폰을"+day+"날짜에 개통하셨습니다.\n"
				+customerName+"고객의 월 핸도폰 요금은 "+price+"원입니다.";
	}
}
class Galaxy extends Phone{
	int price=23000;
	public Galaxy() {
		super("하하","2012-01-01");
	}
	public int getPrice() {
		return price;
	}
	public String showInfo() {
		return customerName+"고객이 아이폰을"+day+"날짜에 개통하셨습니다.\n"
				+customerName+"고객의 월 핸도폰 요금은 "+price+"원입니다.";
	}
}
