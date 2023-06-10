package shopping;

public class Person {
	//손님이름
	String guestName;
	//손님이 가지고 있는 금액
	int money;
	//생성자(외부에서 데이터를 전달받아 멤버변수를 초기화하는 기능)
	
	//외부에서 전달받아
	public Person(String name,int cash){
		this.guestName=name;
		this.money=cash;
	}
	//손님이 현대백화점에서 물건을 구매하는 메서드
	//Hyundae hyundae : Hyundae클래스랑 협력(매개 객체)
	public void buyHyundae(Hyundae hd,int money) {
		//손님이 현대백화점에서 300000원짜리 샌들을 구매함
		String msg=hd.buying(money);
		//손님이 가지고 있는 금액에서 300000원 차감
		this.money-=money;
		System.out.println(guestName+"가(이) "+money+"원에 "+msg);
	}
	//손님이 롯데백화점에서 물건을 구매하는 메서드
	public void buyLotte(Lotte lt,int money) {
		//손님이 현대백화점에서 300000원짜리 샌들을 구매함
		String msg=lt.buying(money);
		//손님이 가지고 있는 금액에서 300000원 차감
		this.money-=money;
		System.out.println(guestName+"가(이) "+money+"원에 "+msg);
	}
}

