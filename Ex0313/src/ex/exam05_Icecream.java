package ex;

public class exam05_Icecream {

	private String guestName;
	private char cupType;
	private int cupCount;
	
	//2번째방법.디폴트생성자 만들어주면 에러 안 남(원래존재함)
	public exam05_Icecream() {}
	//1번째방법.생성자(멤버변수들 초기화)-데이터 한꺼번에 전달받기!!!(없어도됨)
	public exam05_Icecream(String name, char cupType, int cupCount) {
		this.guestName=name;
		this.cupType=cupType;
		this.cupCount=cupCount;
	}
	//private 변수 외부랑 통신하기 위해 get메소드 필요!!!
	public String getName() {
		return this.guestName;
	}
	public void setName(String name) {
		this.guestName=name;
	}
	public String getCupType() {
		//지역변수
		String typeStr="";
		if(this.cupType=='P') {
			typeStr="파인트(3가지 맛)";
		}else if(this.cupType=='Q') {
			typeStr="쿼터(4가지 맛)";
		}else if(this.cupType=='F') {
			typeStr="패밀리(5가지 맛)";
		}else if(this.cupType == 'H') {
			typeStr="하프갤런(6가지 맛)";
		}else{
			typeStr="잘못된 종류입니다.";
		}
		return typeStr;
	}
	public void setCupType(char cupType) {
		this.cupType=cupType;
	}
	public int getCupCount() {
		return this.cupCount;
	}
	public void setCupCount(int cupCount) {
		this.cupCount=cupCount;
	}
	public int getPrice() {
		//지역변수
		int price;
		if(this.cupType=='P') {
			price = 8200;
		}else if(this.cupType=='Q') {
			price = 15500;
		}else if(this.cupType=='F') {
			price = 22000;
		}else if(this.cupType=='H') {
			price = 26500;
		}else{
			price = 0;
		}
		int res=this.cupCount*price;
		return res;
	}
	public void showInfo() {
		System.out.println("고객이름 : "+getName());
		System.out.println("컵 종류 : "+getCupType());
		System.out.println("컵 갯수 : "+getCupCount());
		System.out.println("가격 : "+getPrice()+"원");
	}
}





















