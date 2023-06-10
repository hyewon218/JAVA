package inheritance;

public class PensionTest {

	public static void main(String[] args) {
		
		//Pension클래스로 nolja인스턴스 생성(생성자 호출함)
		Pension nolja=new Pension("석모도펜션",3,4,50000);
		//System.out.println(nolja.showInfo());
		Pension nolja2=new Pension("강화펜션",1,3,50000);
		//System.out.println(nolja2.showInfo());
		
		//PensionChild(자식클래스)로 인스턴스 생성
		PensionChild yellow=new PensionChild();
		yellow.setGuestName("유재석");
		yellow.setGuestAge(51);
		yellow.setRelation("가족");
		//부모클래스 메서드 가져옴
		yellow.setPnum(3);
		yellow.setPname("석모도 펜션");
		yellow.setPday(2);
		yellow.setPpay(50000);
		System.out.println(yellow.showInfo());
		
		PensionChild yellow2=new PensionChild();
		yellow2.setGuestName("김숙");
		yellow2.setGuestAge(48);
		yellow2.setRelation("친구");
		yellow2.setPnum(2);
		yellow2.setPname("강화 펜션");
		yellow2.setPday(1);
		yellow2.setPpay(55000);
		System.out.println(yellow2.showInfo());
	}
}


