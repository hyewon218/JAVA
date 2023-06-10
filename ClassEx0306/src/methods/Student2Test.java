package methods;

public class Student2Test {

	public static void main(String[] args) {
		Stuent2 studentLee=new Stuent2();
		studentLee.setStudentName("이지원");
		System.out.println(studentLee.serialNum);
		studentLee.serialNum++;
		
		Stuent2 studentSon=new Stuent2();
		studentLee.setStudentName("손흥민");
		System.out.println(studentSon.serialNum);
		System.out.println(studentLee.serialNum);
		studentLee.serialNum++;
	}

}



