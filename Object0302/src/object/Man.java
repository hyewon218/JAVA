package object;

public class Man {

	int age;
	String name;
	boolean isMarried;
	int children;

	public String getName() {
		return "�� ���� �̸���"+name+"�Դϴ�.";
	}

	public String getAge() {
		return "�� ���� ���̴�"+age+"�Դϴ�.";
	}

	public String getIsMarried() {
	 return "�� ���� ��ȥ�ϼż� "+isMarried+"�Դϴ�.";
	}
	
	public String getChildren() {
		return "�� ���� �ڳడ"+children+"�� �ֽ��ϴ�.";
	}

	public static void main(String[] args) {

		Man man = new Man();
		man.age = 40;
		man.name = "James";
		man.isMarried = true;
		man.children = 4;
		//man�ν��Ͻ��� ��������� ���� �ֿܼ� ���
		System.out.println("�� ����� ���� : " + man.age);
		System.out.println("�� ����� �̸� : " + man.name);
		System.out.println("�� ����� ��ȥ ���� : " + man.isMarried);
		System.out.println("�� ����� �ڳ� �� : " + man.children);
		System.out.println();
		//man�ν��Ͻ��� �޼��带 ȣ��
		//����������� �� �� ���� �� �Լ����� �� �� �ִ�.
		System.out.println(man.getAge());
		System.out.println(man.getName());
		System.out.println(man.getIsMarried());
		System.out.println(man.getChildren());
	}

}
