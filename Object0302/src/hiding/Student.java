package hiding;

public class Student {
	int studentID;
	private String studentName;
	int grade;
	String address;
	//name은 외부에서 값을 전달받는 매개변수
	public String getStudentName(String name) {
		//외부에서 전달받은 name값을 멤버변수 studentName에 전달
		studentName=name;
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName=studentName;
	}
}



