package inheritance;
//extends : 상속을 받는다
//Customer : 부모클래스
//VIPCustomer : 자식클래스(부모클래스의 멤버변수와 메서드 사용 가능)
public class VIPCustomer extends Customer{
	private int agentID;
	double saleRatio;
	//생성자
	public VIPCustomer() {}
	//263페이지
	public VIPCustomer(int customerID,String customerName, int agentID) {
		super(customerID,customerName);
		//customerID=id;
		//customerName=name;
		customerGrade="VIP";
		bonusRatio=0.05;
		saleRatio=0.1;
		this.agentID=agentID;
	}
	//보너스 포인트 계산하는 메서드
	//(부모클래스의 메서드를 자식클래스로 가져와서 다시 정의함(오버라이딩))
	@Override
	public int calcPrice(int price) {
		bonusPoint+=price*bonusRatio;
		return price-(int)(price*saleRatio);
	}
	public String showCustomerInfo() {
		return super.showCustomerInfo()+"담당 상담원 번호는 "+agentID+"입니다.";
	}
	//담당 상담원 아이디(VIP 고객에게만 필요한 메서드)
	public int getAgetnID() {
		return agentID;
	}
}



