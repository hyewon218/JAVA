package object;

public class TicketEx {
	String name;
	int age;
	String grade;
	String place;
	// 메서드(기능을 하는 명령어의 모음:함수)
	// get: 값을 얻어오는 함수/set: 값을 설정하는 함수
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String ageShow() {
		// 결과를 저장할 그릇(초기화 시켜주기!)
		String show = "";
		if (age >= 14) {
			show = "관람가능";
		} else {
			show = "관람불가";
		}
		return show;
	}
	public String getGrade() {
		return grade;
	}
	public int priceDecide() {

		int price = 0;
		switch (grade) {
		case "VIP석": price = 160000;
			break;// 필수!!!!!
		case "R석": price = 140000;
			break;
		case "S석": price = 110000;
			break;
		case "A석": price = 80000;
			break;
		default: price = 0;
		}
		return price;
	}
	public String getPlace() {
		return place;
	}
	// 나이가 14세 이상이면 장소 출력하고, 나이가 14세 미만이면 장소에 "없음"출력
	public String placeShow() {
		String placeshow = "";
		if (age >= 14) {
			placeshow = "샤롯";
		} else {
			placeshow = "없음";
		}
		return placeshow;
	}
	public static void main(String[] args) {
		//
		TicketEx ticket = new TicketEx();
		TicketEx ticket2 = new TicketEx();
		
		ticket.name = "김또바";
		ticket.age = 29;
		ticket.grade = "S석";
		ticket.place = "샤롯데씨어터";

		System.out.println("이름 : " + ticket.getName());
		System.out.println("나이 : " + ticket.getAge() + "세(" + ticket.ageShow() + ")");
		System.out.println("가격 : " + ticket.getGrade() + "-" + ticket.priceDecide() + "원");
		System.out.println("장소 : " + ticket.placeShow());

		System.out.println();

		ticket2.name = "유재석";
		ticket2.age = 13;
		ticket2.grade = "";
		ticket2.place = "";

		System.out.println("이름 : " + ticket2.getName());
		System.out.println("나이 : " + ticket2.getAge()+ "세(" + ticket2.ageShow() + ")");
		System.out.println("가격 : " + ticket2.getGrade() + "-" + ticket2.priceDecide() + "원");
		System.out.println("장소 : " + ticket2.placeShow());
	}

}
