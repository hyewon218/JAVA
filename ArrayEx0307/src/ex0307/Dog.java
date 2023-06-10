package ex0307;

public class Dog {
	private String name;
	private String type;
	//생성자
	public Dog(String name, String type) {
		this.name = name;
		this.type = type;
	}
	//외부로 전달하는 메서드
	public String getName() {
		return name;
	}
	//외부에서 전달받는 메서드
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	//외부로 문자열을 전달하는 메서드
	public String showDogInfo() {
		return name + ", " + type;
	}
	//public void showDogInfo2() {
	//	System.out.println(name+", "+type);
	//}
}


