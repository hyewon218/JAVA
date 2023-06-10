package Coffee;

public class Person {
	public String name; //손님 이름
	public int money;	//손님이 가진 돈

	//생성자(멤버변수의 값을 초기화)
	Person(String name, int money) {
		this.name=name;
		this.money=money;
	}
	//별다방에서 커피 구매하기 메서드
	public void buyStarCoffee(StarCoffee sCoffee,int money) {
		//별다방의 4000원 짜리 커피 구매
		String message=sCoffee.brewing(4000);
		//커피 가격만큼 손님의 돈에서 차감
		this.money-=money;
		System.out.println(name+"님이 "+money+"으로 "+message);
	}
	//콩다방에서 커피 구매하기 메서드
	public void buyBeanCoffee(BeanCoffee bCoffee,int money) {
		//콩다방의 4500원 짜리 라떼 구매
		String message=bCoffee.brewing(4500);
		//커피 가격만큼 손님의 돈에서 차감
		this.money-=money;
		System.out.println(name+"님이 "+money+"으로 "+message);
	}
}


