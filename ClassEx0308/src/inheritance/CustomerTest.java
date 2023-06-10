package inheritance;

public class CustomerTest {

	public static void main(String[] args) {
		//Customer클래스로 customerLee인스턴스 생성
		Customer customerLee=new Customer();
		customerLee.setCustomerID(10010);
		customerLee.setCustomerName("이순신");
		customerLee.bonusPoint=1000;
		System.out.println(customerLee.showCustomerInfo());
		
		VIPCustomer customerKim=new VIPCustomer();
		customerKim.setCustomerID(10020);
		customerKim.setCustomerName("김유신");
		customerKim.bonusPoint=10000;
		System.out.println(customerKim.showCustomerInfo());
	}
}



