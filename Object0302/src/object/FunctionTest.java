package object;

public class FunctionTest {

	public static void main(String[] args) {
		//������ ���� num1�� �����ϰ� 10���� �ʱ�ȭ
		int num1=10;
		int num2=20;
		//add�Լ��� ȣ���ϸ鼭 num1������ ���� num2������ ���� add�Լ��� �ѱ��
		//add�Լ����� n1�� num1���� �����ϰ�, n2�� num2���� ������
		//add�Լ����� ���� ������� ���޹޾Ƽ� ������ ���� sum�� ����
		int sum=add(num1,num2);
		System.out.println(num1+"+"+num2+"="+sum+"�Դϴ�.");

	}
	//��ȯ���� �������� add�Լ��� �����ϰ� �Ű����� n1,n2������
	//n1�� num1�� ���޹ް�, n2�� num2�� ���޹޾Ƽ� ���� ���ؼ�
	//������ ���� result�� ������ ���� add�Լ��� ȣ���� ������ �ǵ�����
	private static int add(int n1,int n2) {
		int result=n1+n2;
		return result;
	}

}

