package shopping;

public class Lotte {
	//판매금액
	int money;
	
	public String buying(int money) {
		//롯데백화점의 상품금액(샌달)을 money로 전달받아서 손님이 지불한 금액과 같으면
		//롯데백화점의 매출 증가
		//메세지 콘솔에 출력
		this.money +=money;
		if(money==Product.Lsandal) {
			return "샌들을 구입했습니다.";
		}else if(money==Product.Lshirts) {
			return "티셔츠를 구입했습니다.";
		}else {
			return null;
		}
	}
}

