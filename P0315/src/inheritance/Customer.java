package inheritance;

public class Customer {
//부모클래스
	//protected : 외부클래스에서 사용할 수 없지만 
	//하위클래스에서 사용할 수 있도록 지정하는 예약어
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	//디폴트 생성자
	public Customer() {}
	//생성자
	public Customer(int id,String name) {
		//멤버변수 초기화
		this.customerID=id;
		this.customerName=name;
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




