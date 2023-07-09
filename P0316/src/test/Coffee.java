package test;

public class Coffee {
//부모클래스
	String CoffeeName;
	int price;
	int coupon;
	//디폴트 생성자
	public Coffee() {}
	//생성자
	public Coffee(int price,String name) {
		this.price=price;
		this.CoffeeName=name;
		//주문이 있을 때마다 쿠폰 수 증가
		coupon++;
	}
	public String Message() {
		return "커피 주문 받아요!";
	}
}
//부모클래스 coffee를 상속받는 자식클래스
class Espresso extends Coffee{
	int count=1;
	public Espresso() {
		//부모 클래스의 모든 변수와 메서드를 상속받으면서 price에 8000저장
		super(8000,"에스프레소");
		//this.price=8000;(위 코드와 같은 뜻)
	}
	//자식의 고유한 메서드
	//다른 자식 클래스에서도 정의해서 사용(오버라이딩)
	@Override
	public String Message() {
		return "에스프레소"+count+"잔 주문했습니다.";
	}
}

class CaffeLatte extends Coffee{
	int count=3;
	public CaffeLatte() {
		super(9000,"카페라떼");
	}
	@Override
	public String Message() {
		return "카페라떼"+count+"잔 주문했습니다.";
	}
}
class Cappucino extends Coffee{
	int count=2;
	public Cappucino() {
		super(7000,"카푸치노");
	}
	@Override
	public String Message() {
		return "카푸치노"+count+"잔 주문했습니다.";
	}
}




