package pck;

public class AddSub {

	public static void main(String[] args) {
		int num=10;
		//���� ���� ������(������ �ϰ� ���� res1�� ��� ����)
		int res1= ++num;//11
		System.out.println(res1);
		//���� ���� ������(������ �ϰ� ���� res2�� ��� ����)
		int res2= --num;//10
		System.out.println(res2);
		//���� ���� ������(res3�� ���� ������ �Ŀ� ���ϱ�)
		int res3 = num++;//10
		System.out.println(res3);
		//���� ���� ������(res4�� ���� ������ �Ŀ� ����)
		int res4 =num--;//11
		System.out.println(res4);
		
		int res5=num;//10
		System.out.println(res5);
		

	}

}
