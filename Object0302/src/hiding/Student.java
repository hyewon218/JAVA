package hiding;

public class Student {
	int studentID;
	private String studentName;
	int grade;
	String address;
	//name�� �ܺο��� ���� ���޹޴� �Ű�����
	public String getStudentName(String name) {
		//�ܺο��� ���޹��� name���� ������� studentName�� ����
		studentName=name;
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName=studentName;
	}
}



