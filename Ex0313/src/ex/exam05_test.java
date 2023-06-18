package ex;

public class exam05_test {
//인스턴스 만들 때 값을 넣어서 출력
	public static void main(String[] args) {
		
		//1번째방법.데이터 한꺼번에 전달받기!!!
		exam05_Icecream exam=new exam05_Icecream("유재석",'P',3);
		//2번째방법.값을 따로따로 전달받기!!!
		exam05_Icecream exam2=new exam05_Icecream();
		exam2.setName("유재석");
		exam2.setCupType('P');
		exam2.setCupCount(3);
		//2번째 출력방법(더좋은방법!!!!!)
		exam2.showInfo();

		//1번째 출력방법
		System.out.println("고객이름 : "+exam.getName());
		System.out.println("컵 종류 : "+exam.getCupType());
		System.out.println("컵 갯수 : "+exam.getCupCount());
		System.out.println("가격 : "+exam.getPrice());
	}
}

