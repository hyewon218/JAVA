package test;

public class Guest {
	int money=30000;
	//구매자의 쿠폰 갯수
	int couponCount;
	//구매목록을 저장할 배열 item[]생성
	Coffee[] item=new Coffee[3];
	//인덱스 
	int idx=0;
	
	public void order(Coffee coffee) {
		if(money<coffee.price) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		//손님의 금액에서 주문금액을 뺀다.
		money-=coffee.price;
		//쿠폰1증가
		couponCount+=coffee.coupon;
		//이 커피 객체를 item배열에 저장
		item[idx++]=coffee;
		
		System.out.println(coffee.CoffeeName+"를 주문하셨습니다.");
	}
	void showInfo() {
		System.out.println("현재 손님이 가진 금액은 "+money+"원입니다.");
		System.out.println("현재 쿠폰 갯수는 "+couponCount+"개입니다.");
	}
	void cash() {
		int sum=0;
		String items="";
		for(int i=0; i<item.length; i++) {
			sum+=item[i].price;
			items+=item[i].CoffeeName+",";
		}
		System.out.println("총 주문 금액은 "+sum+"원입니다.");
		System.out.println("구매한 목록은 "+items+"입니다.");
	}
}
























