package methods;

public class Student {
	private int studentID;
	//private:외부에서(main함수)에서 접근 불가->get(),set()필요
	private String studentName;
	private int grade;
	private String address;
	//외부로 studentName변수의 값을 전달하는 메서드
	public String getStudentName() {
		return studentName;
	}
	//외부에서 데이터를 전달받아서 멤버변수에 전달하는 메서드
	public void setStudentName(String studentName) {
		//this : 현재 클래스(Student)를 가리킴
		this.studentName=studentName;
	}
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID=studentID;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade=grade;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address=address;
	}
}


