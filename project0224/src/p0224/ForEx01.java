package p0224;

public class ForEx01 {

	public static void main(String[] args) {
		//for��(�ݺ���)
		//int num1; ������ ���� ���� �� 1�� �ʱ�ȭ(���۰�)
		//num<=10; ���ǹ�(������ ���� ����)
		//num++ -> num������ ���� 1�� ������Ŵ
		for(int num=1; num<=10; num++) {
			System.out.println("��ȣ "+num);
		}
		System.out.println("------------");
		//(���۰�:2,��������:10,������:2)
		for(int num=2; num<=10; num+=2) {
			System.out.println("��ȣ "+num);
		}
		System.out.println("------------");
		//1,3,5,7,9
		for(int num=1; num<=10; num+=2) {
			System.out.println("��ȣ "+num);
		}
		System.out.println("------------");
		
		for(int num=10; num>=1; num--) {
			System.out.println("��ȣ "+num);
		}
		System.out.println("------------");
		
		for(int num=1; num<=5; num++) {
			System.out.println("������");
		}
		System.out.println("------------");


	}

}
