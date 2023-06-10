package inheritance;

public class Customer {
//부모클래스
	//외부 클래스에서 접근 못하는 멤버변수
	private int customerID;
	private String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	//생성자
	public Customer() {
		//멤버변수 초기화
		customerGrade="SILVER";
		bonusRatio=0.01;
	}
	//보너스 포인트 계산하는 메서드
	public int calcPrice(int price) {
		bonusPoint+=price*bonusRatio;
		return price;
	}
	public int getCustomerID() {
		return customerID;   
	}
	public void setCustomerID(int customerID) {
		this.customerID=customerID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName=customerName;
	}
	public String getCustomerGrade() {
		return customerGrade;
	}
	public void setCustomerGrade(String customerGrade) {
		this.customerGrade=customerGrade;
	}
	public String showCustomerInfo() {
		return customerName+" 님의 등급은 "+customerGrade+"이며, 보너스 포인트는"+bonusPoint+"입니다.";
	}
}




