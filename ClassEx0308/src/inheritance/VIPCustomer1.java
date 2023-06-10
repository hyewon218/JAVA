package inheritance;
//(customer+vipcustomer)
public class VIPCustomer1  {
//자식클래스
	private int customerID;
	private String customerName;
	private String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	private int agetID;
	double saleRatio;
	
	public VIPCustomer1() {
		customerGrade="VIP";
		bonusRatio=0.05;
		saleRatio=0.1;
	}
	public int calcPrice(int price) {
		bonusPoint+=price*bonusRatio;
		return price-(int)(price*saleRatio);
	}
	public int getAgetnID() {
		return agetID;
	}
	public String showCustomerInfo() {
		return customerName+" 님의 등급은 "+customerGrade+"이며, 보너스 포인트는"+bonusPoint+"입니다.";
	}
}
