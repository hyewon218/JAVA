package Coffee;

public class CoffeeTest {

	public static void main(String[] args) {
		//이름이 kim이고 가진 돈이 10000인 인스턴스 생성
		Person kim=new Person("Kim", 10000);
		//이름이 hong이고 가진 돈이 8000인 인스턴스 생성
		Person hong=new Person("Hong", 8000);
		//별다방 객체 생성
		StarCoffee starCoffee=new StarCoffee();
		//콩다방 객체 생성
		BeanCoffee beanCoffee=new BeanCoffee();
		//손님 kim이 별다방에서 4000원짜리 커피 구매
		kim.buyStarCoffee(starCoffee, 4000);
		//손님 hong이 콩다방에서 4500짜리 라떼 구매
		hong.buyBeanCoffee(beanCoffee, 4500);
	}

}


