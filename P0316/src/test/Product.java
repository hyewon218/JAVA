package test;
//부모클래스	
class Product {
	//private라면-set,get함수 필수!
	//제품이름
	String pName;
	//제품가격
	int price;
	//보너스
	int bonus;
	//디폴트 생성자
	public Product() {}
	//생성자
	public Product(String name, int price, int bonus) {
		this.pName=name;
		this.price=price;
		this.bonus=bonus;
		//보너스 점수 계산(제품가격의 10%)
		bonus=(int)(price*0.1);
	}
}
//자식클래스1(손선풍기)
class Fan extends Product{
	//생성자
	public Fan() {
		//부모 클래스의 멤버들을 상속받음
		super("손선풍기",15000,150);
	}
	//멤버메서드
	public String showInfo() {
		return "손선풍기를 구매했습니다.";
	}
}
//자식클래스2(노트)
class Note extends Product{
	//생성자
	public Note() {
		//부모 클래스의 멤버들을 상속받음
		super("스프링노트",2000,20);
	}
	//멤버메서드
	public String showInfo() {
		return "노트를 구매했습니다.";
	}
}
//자식클래스3(아이패드)
class Ipad extends Product{
	//생성자
	public Ipad() {
		//부모 클래스의 멤버들을 상속받음
		super("아이패드",400000,4000);
		//같은코드!
		//pName="아이패드";
		//price=40000;
		//bonus=4000;
	}
	//멤버메서드
	public String showInfo() {
		return "아이패드를 구매했습니다.";
	}
}


























