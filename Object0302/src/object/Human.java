package object;

public class Human {
	String name;
	float height;
	float weight;

	//����Ʈ ������
	public Human() {}
	//�̸��� �Ű������� �Է¹޴� ������
	public Human(String pname) {
		name=pname;
	}
	//�̸�, Ű, �����Ը� �Ű������� �Է¹޴� ������
	public Human(String pname, float pheight, float pweight) {
		//�Ű����� pname�� ���� HumanŬ������ 
		//��������� name�� ����(����, ����)
		//this : ���� Ŭ������ ����Ŵ, ���� ����
		this.name=pname;
		this.height=pheight;
		this.weight=pweight;
		//����(�ڱⲨ)���� �ű��.
	}
}


