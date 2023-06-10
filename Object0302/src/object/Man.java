package object;

public class Man {

	int age;
	String name;
	boolean isMarried;
	int children;

	public String getName() {
		return "그 분의 이름은"+name+"입니다.";
	}

	public String getAge() {
		return "그 분의 나이는"+age+"입니다.";
	}

	public String getIsMarried() {
	 return "그 분은 결혼하셔서 "+isMarried+"입니다.";
	}
	
	public String getChildren() {
		return "그 분은 자녀가"+children+"명 있습니다.";
	}

	public static void main(String[] args) {

		Man man = new Man();
		man.age = 40;
		man.name = "James";
		man.isMarried = true;
		man.children = 4;
		//man인스턴스의 멤버변수의 값을 콘솔에 출력
		System.out.println("이 사람의 나이 : " + man.age);
		System.out.println("이 사람의 이름 : " + man.name);
		System.out.println("이 사람의 결혼 여부 : " + man.isMarried);
		System.out.println("이 사람의 자녀 수 : " + man.children);
		System.out.println();
		//man인스턴스의 메서드를 호출
		//멤버변수에는 할 수 없는 것 함수에서 할 수 있다.
		System.out.println(man.getAge());
		System.out.println(man.getName());
		System.out.println(man.getIsMarried());
		System.out.println(man.getChildren());
	}

}
