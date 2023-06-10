package arrayList;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee=new Student(1001, "이사동");
		studentLee.addSubject("국어", 100);
		studentLee.addSubject("수학", 50);
		
		Student studentKim=new Student(1002, "김사슴");
		studentKim.addSubject("국어", 70);
		studentKim.addSubject("수학", 85);
		studentKim.addSubject("영어", 100);
		
		Student studentChoi=new Student(1002, "최불암");
		studentChoi.addSubject("국어", 100);
		studentChoi.addSubject("수학", 80);
		studentChoi.addSubject("영어", 70);
		
		studentLee.showStudentInfo();
		System.out.println("==========================");
		studentKim.showStudentInfo();
		System.out.println("==========================");
		studentChoi.showStudentInfo();
	}
}


