package test;

public class BuyTest {

	public static void main(String[] args) {
		//Buy클래스로 buy 인스턴스 생성
		Buy buy=new Buy();
		//자식클래스로 새로운 객체를 생성하고, buy인스턴스의 buy메서드를 호출하면서
		//새로운 객체를 매개변수로 전달(product=new Ipad())
		buy.buy(new Ipad());
		buy.buy(new Note());
		buy.buy(new Fan());
		buy.buying();
		buy.showInfo();
	}
}


