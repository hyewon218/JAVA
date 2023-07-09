package test;

public class PhoneGuest {

	// 사용개월수 :month
	//public String totalPrice(Phone phone) {
	//	int month=3;
	//	return phone.customerName+" 고객이 "+month+"달 간 사용한 핸드폰 요금은"
	//			+ phone.getPrice()*month+"원입니다.";
	//}
	public void totalPrice1(Phone phone) {
		int month=3;
		System.out.println(phone.customerName+" 고객이 "+month+"달 간 사용한 핸드폰 요금은"
				+ phone.getPrice()*month+"원입니다.");
	}
	

}
