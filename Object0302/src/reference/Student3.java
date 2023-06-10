package reference;

public class Student3 {
	int studentID;
	String studentName;
	//참조 자료형
	//(클래스를 자료형처럼 사용 가능)
	Subject korean;
	Subject math;
	
	public void getName() {
		korean.SubjectName="홍길동";
		math.scorePoint=50;
	}
}

	