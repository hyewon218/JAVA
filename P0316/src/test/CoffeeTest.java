package test;

public class CoffeeTest extends Coffee{

	public static void main(String[] args) {
		
		CoffeeTest test=new CoffeeTest();
		test.coffee(new Espresso());
		test.coffee(new CaffeLatte());
		test.coffee(new Cappucino());
		//위랑 같은 코드
		//Coffee esp=new Espresso();
		//Coffee latte=new CaffeLatte();
		//Coffee capu=new Cappucino();
		//System.out.println(esp.Message());
		//System.out.println(latte.Message());
		//System.out.println(capu.Message());
		Guest guest=new Guest();
		guest.order(new Espresso());
		guest.order(new CaffeLatte());
		guest.order(new Cappucino());
		guest.showInfo();
		guest.cash();
	}
	public void coffee(Coffee coffee) {
		System.out.println(coffee.Message());
	}
}

