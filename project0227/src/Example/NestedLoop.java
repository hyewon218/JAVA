package Example;

public class NestedLoop {

	public static void main(String[] args) {
		//��ø �ݺ���(������)
		int dan;
		int times;
		//dan ������ 2~9���� 8�� ����
		for(dan=2; dan<=9; dan++) {
			//dan�� 1 ������ ������ times=1~9���� ����
			//times������ 1~9���� 9�� ����
			for(times=1; times<=9; times++) {
				//72�� �ݺ���
				System.out.println(dan+"X"+times+"="+dan*times);
			}
			//�� �� ���
			System.out.println();
		}

	}

}
