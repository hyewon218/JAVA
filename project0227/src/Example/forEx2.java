package Example;

public class forEx2 {

	public static void main(String[] args) {
		
		int sum=0;
		//i������ ���� 1���� �����ؼ� �ϳ��� �����ϴٰ� 100���� Ŀ���� for�� ��������
		for(int i=1;i<=100;i++) {
			/*
			 * if(i%2 !=0) continue;
			 */
			//���� i������ ���� 2�� ���� �������� 0�̶�� 
			if(i%2==0) {
				//2�� ����� sum������ ��� ����(������)
				sum+=i;
				//i������ ���� �ֿܼ� ���
				System.out.println(i);
			}
		}
		System.out.println();
		//2�� ����� ���� �ֿܼ� ���
		System.out.println("1~100 �� �� 2�� ����� ��"+sum);
	}

}
