package object;
import java.math.BigInteger;

public class Order {
	//BigInteger : int보다 큰 정수 표현에 사용, 무한대로 사용 가능
	BigInteger orderNum=new BigInteger("201803120001");
	//String orderNum;
	String orderId;
	String orderDay;
	String orderName;
	String prodName;
	String address;
	
	public String getOrderNum() {
		return "주문 번호 : "+orderNum;
	}
	public String getOrderId() {
		return "주문자 아이디 : "+orderId;
	}
	public String getOrderDay() {
		return "주문 날짜 : "+orderDay;
	}
	public String getOrderName() {
		return "주문자 이름 : "+orderName;
	}
	public String getProdName() {
		return "주문 날짜 : "+prodName;
	}
	public String getAddress() {
		return "주문자 이름 : "+address;
	}
	
	
	public static void main(String[] args) {
		
		Order order=new Order();
		//order.orderNum="201803120001";
		order.orderId="abc123";
		order.orderDay="2018년 3월 12일";
		order.orderName="홍길순";
		order.prodName="PD0345-12";
		order.address="서울시 영등포구 여의도동 20번지";
		
		System.out.println("주문 번호 : "+order.orderNum);
		System.out.println("주문자 아이디 : "+order.orderId);
		System.out.println("주문 날짜 : "+order.orderDay);
		System.out.println("주문자 이름 : "+order.orderName);
		System.out.println("주문 상품 번호 : "+order.prodName);
		System.out.println("배송 주소 : "+order.address);
		
		System.out.println(order.getOrderNum());
		System.out.println(order.getOrderId());
		System.out.println(order.getOrderDay());
		System.out.println(order.getOrderName());
		System.out.println(order.getProdName());
		System.out.println(order.getAddress());	
	}
}

