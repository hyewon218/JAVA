package object;

public class Student {
	//멤버변수
	int studentID;
	String studentName;
	int grade;
	String address;
	
	//메서드(멤버함수), 되돌리는 값은 문자열형, 함수이름: getStudntName
	public String getStudentName() {
		//studentName 멤버변수의 값을 되돌림
		return studentName;
	}
	public int getStudentGrade() {
		return grade;
	}
	//메인함수
	public static void main(String[] args) {
		//Student클래스(설계도) 기반의 인스턴스 생성, 인스턴스이름: studentAhn
		//new Student()=> Student클래스를 기반으로 새로운 객체 생성
		//컴퓨터 메모리에 만들어짐(클래스(설계도,구조,허상)와 인스턴스와의 차이)
		//무한대로 인스턴스 생성 가능!
		Student studentAhn=new Student();
		//studentAhn인스턴스 안의 studentName변수의 값을 "안중근"으로 초기화
		studentAhn.studentName="안중근";
		studentAhn.grade=100;
		//콘솔에 인스턴스의 멤버변수 studentName의 값을 출력
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.grade);
		//인스턴스의 멤버함수를 호출하여 그 결과값을 콘솔에 출력
		System.out.println(studentAhn.getStudentName());
		
		//student클래스(설계도)를 기반으로 인스턴스 생성
		Student studentKim=new Student();
		studentKim.studentID=1;
		studentKim.studentName="김수한무";
		studentKim.grade=80;
		studentKim.address="인천";
		
		System.out.println(studentKim.getStudentName());
		System.out.println(studentKim.getStudentGrade());
	}
}

	





















