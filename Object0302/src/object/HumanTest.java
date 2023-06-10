package object;

public class HumanTest {

	public static void main(String[] args) {
		//외부의 Human클래스를 main함수로 가져와서
		//humanKim이라는 인스턴스를 생성함
		Human humanKim=new Human();
		humanKim.name="홍길동";
		humanKim.height=170F;
		humanKim.weight=60F;
		System.out.println(humanKim.name);
		System.out.println(humanKim.height);
		System.out.println(humanKim.weight);
		//매개변수 3개인 인스턴스 생성
		Human humanLee=new Human("박진주", 155.0F, 45.0F);
		System.out.println(humanLee.name);
		System.out.println(humanLee.height);
		System.out.println(humanLee.weight);
	}

}






