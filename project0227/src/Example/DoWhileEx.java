package Example;

public class DoWhileEx {

	public static void main(String[] args) {
		int num=1;
		int sum=0;
		//while���� do~while���� ���̴� do~while���� do{}���๮�� �ݵ�� 1���� ������.
		do {
			sum+=num;
			num++;
			
		}while(num<=10);
		
		System.out.println("1���� 10������ ����: "+sum);
	}

}
