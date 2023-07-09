package inheritance;

public class OverridingTest2 {

	public static void main(String[] args) {
		//클래스에서의 묵시적 형변환
		//Customer : 자료형(부모클래스)
		Customer vc=new VIPCustomer(10030,"나몰라",2000);
		vc.bonusPoint=1000;
	
		System.out.println(vc.getCustomerName()+"님이 지불해야 하는 금액은 "+vc.calcPrice(10000)+"원입니다.");
	}
}

