package object;

public class Student {
	//�������
	int studentID;
	String studentName;
	int grade;
	String address;
	
	//�޼���(����Լ�), �ǵ����� ���� ���ڿ���, �Լ��̸�: getStudntName
	public String getStudentName() {
		//studentName ��������� ���� �ǵ���
		return studentName;
	}
	public int getStudentGrade() {
		return grade;
	}
	//�����Լ�
	public static void main(String[] args) {
		//StudentŬ����(���赵) ����� �ν��Ͻ� ����, �ν��Ͻ��̸�: studentAhn
		//new Student()=> StudentŬ������ ������� ���ο� ��ü ����
		//��ǻ�� �޸𸮿� �������(Ŭ����(���赵,����,���)�� �ν��Ͻ����� ����)
		//���Ѵ�� �ν��Ͻ� ���� ����!
		Student studentAhn=new Student();
		//studentAhn�ν��Ͻ� ���� studentName������ ���� "���߱�"���� �ʱ�ȭ
		studentAhn.studentName="���߱�";
		studentAhn.grade=100;
		//�ֿܼ� �ν��Ͻ��� ������� studentName�� ���� ���
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.grade);
		//�ν��Ͻ��� ����Լ��� ȣ���Ͽ� �� ������� �ֿܼ� ���
		System.out.println(studentAhn.getStudentName());
		
		//studentŬ����(���赵)�� ������� �ν��Ͻ� ����
		Student studentKim=new Student();
		studentKim.studentID=1;
		studentKim.studentName="����ѹ�";
		studentKim.grade=80;
		studentKim.address="��õ";
		
		System.out.println(studentKim.getStudentName());
		System.out.println(studentKim.getStudentGrade());
	}
}

	





















