package Example;

public class forEx1 {

	public static void main(String[] args) {
		//���� �ﰢ�� ���� �����, ��ø for��
		//i=1...j=1,2,3,4,5
		//i=2...j=2,3,4,5
		//i=3...j=3,4,5
		//i=4...j=4,5
		//i=5...j=5
		for(int i=1; i<=5; i++) {
			for(int j=i; j<=5; j++) {
				//System.out.println(�� �ٸ� ���, �ڵ� �ٹٲ�)
				System.out.print("*");
			}
			//�ٹٲ�
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
