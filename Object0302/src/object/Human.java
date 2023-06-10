package object;

public class Human {
	String name;
	float height;
	float weight;

	//디폴트 생성자
	public Human() {}
	//이름을 매개변수로 입력받는 생성자
	public Human(String pname) {
		name=pname;
	}
	//이름, 키, 몸무게를 매개변수로 입력받는 생성자
	public Human(String pname, float pheight, float pweight) {
		//매개변수 pname의 값을 Human클래스의 
		//멤버변수인 name에 전달(대입, 저장)
		//this : 현재 클래스를 가리킴, 생략 가능
		this.name=pname;
		this.height=pheight;
		this.weight=pweight;
		//왼쪽(자기꺼)으로 옮긴다.
	}
}


