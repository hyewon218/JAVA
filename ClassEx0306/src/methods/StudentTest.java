package methods;

public class StudentTest {

	public static void main(String[] args) {
		//Student클래스를 사용하여 studentLee인스턴스 생성함
		Student studentLee=new Student();
		//studentLee인스턴스 멤버함수setStudentName호출함
		//함수 호출하면 데이터를 넘김("박보검")
		//setStudentName()메서드를 활용해 private 변수에 접근 가능
		studentLee.setStudentName("박보검");
		studentLee.setStudentID(123);
		studentLee.setGrade(3);
		studentLee.setAddress("인천광역시 서구");
		//studentLee.setStudentName="박보검";
		//studentLee인스턴스의 getStudentName함수 호출
		System.out.println(studentLee.getStudentName());
		System.out.println(studentLee.getStudentID());
		System.out.println(studentLee.getGrade());
		System.out.println(studentLee.getAddress());

	}

}



