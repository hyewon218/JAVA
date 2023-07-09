package inheritance;

//부모 클래스
class Animal{
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}
//자식 클래스 Human이 Anumal클래스를 상속받는다.
class Human extends Animal {
	//@Override 생략된것!! 
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
}
//자식 클래스 Tiger가 Animal클래스를 상속받는다.
class Tiger extends Animal {
	public void move() {
	System.out.println("호랑이가 네 발로 뜁니다.");
	}
}
//자식 클래스 Engel이 Animal클래스를 상속받는다.
class Eagle extends Animal{
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}
}
public class AnimalTest1 {	
	
	public static void main(String[] args) {
		//AnimalTest1클래스를 사용하여 aTest인스턴스 생성
		AnimalTest1 aTest=new AnimalTest1();
		//aTest인스턴스의 메서드 호출(자식 객체를 매개변수로 전달)
		aTest.moveAnimal(new Human());
		aTest.moveAnimal(new Tiger());
		aTest.moveAnimal(new Eagle());
		System.out.println("================");
		aTest.moveAnimal(new Animal());
		System.out.println("================");
		//부모 클래스로 am인스턴스 생성
		Animal am=new Animal();
		am.move();
	}
	//AnimalTest1클래스의 멤버 메서드, 매개변수로 Animal클래스 전달받음
	//소문자 animal은 Animal클래스로 만들어진 인스턴스임
	//이 메서드는 어떤 인스턴스가 매개변수로 넘어와도 모두 Animal형으로 변환한다.
	//Animal에서 상속받은 클래스가 매개변수로 넘어오면 모두 Animal형으로 변환되므로
	//animal.move() 메서드를 호출할 수 있다.
	//(Animal의 move가 아닌 매개변수로 넘어온 실제 인스턴스 메서드)
	//Animal animal=new Human()
	//Animal animal=new Tiger()
	//Animal animal=new Eagle()
	public void moveAnimal(Animal animal) {
		animal.move();
	}
}



