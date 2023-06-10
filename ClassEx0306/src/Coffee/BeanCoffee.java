package Coffee;

public class BeanCoffee {
	int money;
	
	public String brewing(int money) {
		this.money +=money;
		if(money==Menu.BEANAMERICANO) {
			return "콩다방 아메리카노를 구입했습니다.";
		}else if(money==Menu.BEANLATTE){
			return "콩다방 라떼를 구입했습니다.";
		}else {
			//null값을 리턴
			return null;
		}
	}
}


