package methods;

class Person{
	String name;
	int age;
	
	//생성자(클래스 이름과 생성자 이름이 같음)
	public Person(){
		//Person생성자에서 다른 생성자를 호출하면서
		//name에 "이름 없음", age에 1을 전달함
		this("이름 없음",1);
	}
	//외부의 값을 받아서 멤버변수의 값을 초기화하는 생성자함수
	public Person(String name, int age){
		this.name=name;
		this.age=age;
	}
}

public class CallAnotherConst {

	public static void main(String[] args) {
		Person noName=new Person();
		System.out.println(noName.name);
		System.out.println(noName.age);
	}
}


