package shopping;

public class soppingTest {

	public static void main(String[] args) {
		//손님 인스턴스(가지고 있는 금액 : 400000)
		Person kim=new Person("김여사",400000);
		//손님 인스턴스(가지고 있는 금액 : 1000000)
		Person oh=new Person("오쌤", 1000000);
		//현대백화점 인스턴스
		Hyundae hd=new Hyundae();
		//롯데백화점 인스턴스
		Lotte lt=new Lotte();
		//김여사는 400000원으로 현대백화점에서 쇼핑함
		kim.buyHyundae(hd, 300000);
		//오쌤은 1000000원으로 롯데백화점에서 쇼핑함
		oh.buyLotte(lt, 240000);
		//콘솔에 결과 출력
	}

}













