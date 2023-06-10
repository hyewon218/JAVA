package inheritance;
//extends : 상속을 받는다
//Customer : 부모클래스
//VIPCustomer : 자식클래스(부모클래스의 멤버변수와 메서드 사용 가능)
public class VIPCustomer extends Customer{
	private int agentID;
	double saleRatio;
	//생성자
	public VIPCustomer() {
		customerGrade="VIP";
		bonusRatio=0.05;
		saleRatio=0.1;
	}
	//담당 상담원 아이디(VIP 고객에게만 필요한 메서드)
	public int getAgetnID() {
		return agentID;
	}
}


