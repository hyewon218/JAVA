package pck;

public class exImplicit {

	public static void main(String[] args) {
		
		int n1=10;
		float f1=5.7f;
		double d1=9.3;
		char c1='��';
		
		//�Ǽ��� ���� 2���� ���������� ����ȯ�Ͽ� ���� ���� ������� �ֿܼ� ���
		int n2=(int)f1+(int)d1;
		//������ �������� �Ǽ������� ����ȯ�Ͽ� �ֿܼ� ���
		float f2=(float)n1;
		
		System.out.println(f2);
		System.out.println(n2);
		System.out.println((int)c1);

	}

}
