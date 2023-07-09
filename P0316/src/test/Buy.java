package test;

public class Buy {
	//구매자가 가지고 있는 금액
	int money=500000;
	//구매자의 보너스 점수
	int bonusPoint=0;
	//구매자가 구매한 물건 이름을 배열로 지정
	//Product클래스를 이용하여 배열 5개를 생성
	Product[] item=new Product[3];
	int idx=0;
	//디폴트 생성자
	//public Buy() {}
	//생성자(매개변수 : product, 자료형 : Product클래스)
	public void buy(Product product) {
		//만약 구매자의 소유 금액보다 구매물건의 가격이 더 많다면 
		if(money < product.price) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		//구매자의 소유 금액에서 구매물건 값을 빼기
		money-=product.price;
		//보너스 점수 저장
		bonusPoint +=product.bonus;
		//item 배열에 매개변수로 전달받은 product객체를 저장
		//item 배열의 인덱스 번호를 1씩 증가시킴(반복문짧게쓴코드)
		item[idx++]=product;
		//쉬운코드!!
		//for(idx=0; idx<item.length; idx++) {
		//	item[idx]=product;
		//}
		System.out.println(product.pName+"를(을) 구입하셨습니다.");
	}
	void showInfo() {
		System.out.println("현재 남은 금액은 "+money+"원입니다.");
		System.out.println("현재 보너스 점수는 "+bonusPoint+"점입니다.");
	}
	//물건 구매
	void buying() {
		int sum=0;
		String items="";
		for(int i=0; i<item.length; i++) {
			//구매한 목록의 가격을 sum변수에 누적하여 더함(누적합)
			sum += item[i].price;
			//구매한 목록을 itemCount에 누적시킴
			items += item[i].pName+",";
		}
		System.out.println("구매한 목록의 총 금액은 "+sum+"원입니다.");
		System.out.println("구매한 목록은 "+items+"입니다.");
	}
}





























