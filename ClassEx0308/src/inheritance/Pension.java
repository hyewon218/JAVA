package inheritance;

public class Pension {
	private String pName;
	private int pDay;
	private int pNum;
	private int pPay;
	//기본생성자(상속 에러주의!/생성자 안 만들고 private->protected로 바꿔도 됨)
	public Pension() {}
	//기본숙박비 메서드 초기화
	public Pension(String name, int day, int num, int pay) {
		this.pName=name;
		this.pDay=day;
		this.pNum=num;	
		this.pPay=pay;
	}
	//get-각 변수의 값을 외부클래스로 전달(출력)하는 메서드
	public String getPname() {
		return pName;
	}
	//set-외부클래스에서 값을 전달받아서 현재클래스의 멤버변수에 저장하는 메서드
	//= : 오른쪽에 왼쪽으로 대입하는 연산자
	public void setPname(String name) {
		this.pName=name;
	}
	public int getPday() {
		return pDay;
	}
	public void setPday(int day) {
		this.pDay=day;
	}
	public int getPnum() {
		return pNum;
	}
	public void setPnum(int num) {
		this.pNum=num;
	}
	public int getPpay() {
		return pNum;
	}
	public void setPpay(int pay) {
		this.pPay=pay;
	}
	//총비용 구하는 메서드
	public int charge() {
		//숙박일(pDay)*숙박인원(pDay)*기본숙박비(pPay)
		//+1--->나 포함하기
		int result=pDay*(pNum+1)*pPay;
		return result;
	}
	//외부클래스로 메세지 전달하는 메서드 생성
	public String showInfo() {
		return "가족 "+this.pNum+"명과 함께 "+this.pName+"에 "
	           +this.pDay+"동안 놀러가는 비용은"+charge()+"원입니다.";
	}
}












