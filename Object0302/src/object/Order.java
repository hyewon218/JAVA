package object;
import java.math.BigInteger;

public class Order {
	//BigInteger : int���� ū ���� ǥ���� ���, ���Ѵ�� ��� ����
	BigInteger orderNum=new BigInteger("201803120001");
	//String orderNum;
	String orderId;
	String orderDay;
	String orderName;
	String prodName;
	String address;
	
	public String getOrderNum() {
		return "�ֹ� ��ȣ : "+orderNum;
	}
	public String getOrderId() {
		return "�ֹ��� ���̵� : "+orderId;
	}
	public String getOrderDay() {
		return "�ֹ� ��¥ : "+orderDay;
	}
	public String getOrderName() {
		return "�ֹ��� �̸� : "+orderName;
	}
	public String getProdName() {
		return "�ֹ� ��¥ : "+prodName;
	}
	public String getAddress() {
		return "�ֹ��� �̸� : "+address;
	}
	
	
	public static void main(String[] args) {
		
		Order order=new Order();
		//order.orderNum="201803120001";
		order.orderId="abc123";
		order.orderDay="2018�� 3�� 12��";
		order.orderName="ȫ���";
		order.prodName="PD0345-12";
		order.address="����� �������� ���ǵ��� 20����";
		
		System.out.println("�ֹ� ��ȣ : "+order.orderNum);
		System.out.println("�ֹ��� ���̵� : "+order.orderId);
		System.out.println("�ֹ� ��¥ : "+order.orderDay);
		System.out.println("�ֹ��� �̸� : "+order.orderName);
		System.out.println("�ֹ� ��ǰ ��ȣ : "+order.prodName);
		System.out.println("��� �ּ� : "+order.address);
		
		System.out.println(order.getOrderNum());
		System.out.println(order.getOrderId());
		System.out.println(order.getOrderDay());
		System.out.println(order.getOrderName());
		System.out.println(order.getProdName());
		System.out.println(order.getAddress());	
	}
}

