package inheritance;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		//Customer클래스로 배열객체를 생성함
		ArrayList<Customer> customerList=new ArrayList<Customer>();
		//Customer클래스로 customerLee인스턴스 객체 생성하고 값 전달
		Customer customerLee=new Customer(10010, "이순신");
		Customer customerShin=new Customer(10020, "신사임당");
		Customer customerHong=new GoldCustomer(10030, "홍길동");
		Customer customerYoul=new GoldCustomer(10040, "이율곡");
		Customer customerKim=new VIPCustomer(10050, "김유신", 12345);
		//객체배열에 인스턴스를 자료로 추가함
		customerList.add(customerLee);
		customerList.add(customerShin);
		customerList.add(customerHong);
		customerList.add(customerYoul);
		customerList.add(customerKim);
		//클래스가 자료형처럼 쓰임
		System.out.println("==============고객 정보 출력================");
		//customerList배열의 요소를 하나씩 가져와서 Customer 형 변수에 넣는다
		for(Customer customer : customerList){
			System.out.println(customer.showCustomerInfo());
		}
		System.out.println("===========할인율과 보너스 포인트 계산==========");
		int price=10000;
		//고객정보를 ArrayList에 저장할 때 Customer형으로 형변환하여 추가했기 때문에
		//배열 요소를 하나씩 가져올 때도 Customer형으로 가져오게 된다.
		for(Customer customer:customerList) {
			int cost=customer.calcPrice(price);
			System.out.println(customer.getCustomerName()+" 님이 "+ cost+"원 지불하셨습니다.");
			System.out.println(customer.getCustomerName()+"님의 현재 보너스 포인트는"+customer.bonusPoint+"점입니다.");
		}
	}
}

