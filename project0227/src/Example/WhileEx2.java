package Example;

public class WhileEx2 {

	public static void main(String[] args) {
		
		//10~30 �� 2�� ������� ��(10+...+30)
		int num=8;
		int sum=0;
		
		while(num<30) {
			//sum=sum+num;
			num+=2;
			sum+=num;
			System.out.println(num);
		}
		
		System.out.println(num);
		System.out.println("10���� 30������ 2�ǹ���� ���� "+sum+"�Դϴ�.");

		
	}

}
