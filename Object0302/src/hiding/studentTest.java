package hiding;

public class studentTest {

	public static void main(String[] args) {
		Student studentLee=new Student();
		//private�� ������ ��������� ������ �� ����.(����)
		//studentLee.studentName="������";
		
		//���� ������ �������(��������)
		studentLee.grade=70;
		studentLee.address="��⵵";
		//�޼��忡�� ���� ������(public���� ����)
		System.out.println(studentLee.getStudentName("������"));
	}

}

