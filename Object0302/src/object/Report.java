package object;

public class Report {
	//���赵
	String name;
	String depart;
	int kor;
	int eng;
	int mat;

	public String getName() {
		return name;
	}
	public String getDepart() {
		return depart;
	}	
	public int getTotal() {
		//total�� getTotal �Լ� �������� ��� ������ ��������
		int total=kor+eng+mat;
		return total;
	}
	public float getAvg() {
		float avg=(float)(kor+eng+mat)/3.0f;
		return avg;
	}
	public String getComplete() {
		float avg=(float)(kor+eng+mat)/3.0f;
		String res;
		if(avg>=60) {
			res="�̼�";		
		}else {
			res="���̼�";
		}
		return res;
	}
	public static void main(String[] args) {
		//Ŭ���� Report�� ����� �ν���Ʈ ����
		Report sdt=new Report();
		//sdt�ν��Ͻ��� ������ ���� �Է�
		sdt.name="�ڸ��";
		sdt.depart="���а�";
		sdt.kor=80;
		sdt.eng=70;
		sdt.mat=60;

		
		//����Լ��� ���� ���
		System.out.println("�л� �̸� : "+sdt.name);
		System.out.println("�л� �а� : "+sdt.depart);
		System.out.println("���� ���� : "+sdt.kor);
		System.out.println("���� ���� : "+sdt.eng);
		System.out.println("���� ���� : "+sdt.mat);
		System.out.println("���� : "+sdt.getTotal());
		System.out.println("��� : "+sdt.getAvg());
		System.out.println("�̼� ����: "+sdt.getComplete());
		
		//�ٸ� �ν��Ͻ� ����
		Report usinerse=new Report();
		usinerse.name="������";
		usinerse.depart="ü���а�";
		usinerse.kor=80;
		usinerse.eng=40;
		usinerse.mat=50;
		
		System.out.println("�л� �̸� : "+usinerse.name);
		System.out.println("�л� �а� : "+usinerse.depart);
		System.out.println("���� ���� : "+usinerse.kor);
		System.out.println("���� ���� : "+usinerse.eng);
		System.out.println("���� ���� : "+usinerse.mat);
		System.out.println("���� : "+usinerse.getTotal());
		System.out.println("��� : "+usinerse.getAvg());
		System.out.println("�̼� ����: "+usinerse.getComplete());
	}

}
