package hiding;

public class studentTest {

	public static void main(String[] args) {
		Student studentLee=new Student();
		//private로 정의한 멤버변수에 접근할 수 없다.(에러)
		//studentLee.studentName="정준하";
		
		//접근 가능한 멤버변수(에러없음)
		studentLee.grade=70;
		studentLee.address="경기도";
		//메서드에는 접근 가능함(public으로 선언)
		System.out.println(studentLee.getStudentName("정준하"));
	}

}

