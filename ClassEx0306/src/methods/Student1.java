package methods;

public class Student1 {
	//외부 클래스에서 접근 가능한 멤버변수
	public String studentName;//이름
	public int grade;//학년
	public int money;//용돈
	//생성자(매개변수 2개로 이름과 용돈을 전달받아서 멤버변수 초기화)
	public Student1(String studentName, int money) {
		this.studentName=studentName;
		this.money=money;
	}
	//Bus클래스를 사용한 객체 bus를 매개 객체로 사용하는 메서드 
	public void takeBus(Bus bus) {
		//bus 인스턴스의 멤버함수 take를 호출함(1000은 take함수로 전달)
		bus.take(1000);
		//학생의 용돈에서 1000 감소
		this.money-=1000;
	}
	//Bus클래스를 사용한 객체 subway를 매개 객체로 사용하는 메서드 
	public void takeSubway(Subway subway) {
		//subway 인스턴스의 멤버함수 take를 호출함(1500은 take함수로 전달)
		subway.take(1500);
		//학생의 용돈에서 1500 감소
		this.money-=1500;
	}
	public void showInfo() {
		System.out.println(studentName+"님의 남은 돈은"+money+"입니다.");
	}

}



