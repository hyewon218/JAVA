package inheritance;

import java.util.ArrayList;

class Animal2 {
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}
//자식 클래스 : Human2, 부모 클래스 : Animal2
class Human2 extends Animal2 {
	@Override
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
	//Human2에만 있는 고유 메서드
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
}
class Tiger2 extends Animal2 {
	@Override
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}

	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}
class Eagle2 extends Animal2 {
	@Override
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}

	public void flying() {
		System.out.println("독수리가 날개를 쭉 펴고 멀리 날아갑니다.");
	}
}
public class AnimalTest {
	//ArrayList로 객체배열(aniList) 생성
	ArrayList<Animal2> aniList = new ArrayList<Animal2>();

	public static void main(String[] args) {
		AnimalTest aTest = new AnimalTest();
		//aTest인스턴스의 멤버메서드 호출
		aTest.addAnimal();
		System.out.println("원래 형으로 다운캐스팅");
		aTest.testCasting();
	}
	public void addAnimal() {
		aniList.add(new Human2());
		aniList.add(new Tiger2());
		aniList.add(new Eagle2());
		//객체배열의 갯수(3)만큼 반복
		for (Animal2 ani : aniList) {
			ani.move();
		}
	}
	public void testCasting() {
		for (int i = 0; i < aniList.size(); i++) {
			Animal2 ani = aniList.get(i);
			//ani객체를 다운캐스팅함(Animal2클래스에서 Human2로 형변환)
			if (ani instanceof Human2) {
				Human2 h = (Human2) ani;
				h.readBook();
			} else if (ani instanceof Tiger2) {
				Tiger2 t = (Tiger2) ani;
				t.hunting();
			} else if (ani instanceof Eagle2) {
				Eagle2 e = (Eagle2) ani;
				e.flying();
			} else {
				System.out.println("지원되지 않는 형입니다.");
			}
		}
	}
}


