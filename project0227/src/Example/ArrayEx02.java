package Example;

public class ArrayEx02 {

	public static void main(String[] args) {
		
		int[] box= {59,20,35,61,79,83,48,100,16,7};
		
		int sum1=0;
		int sum2=0; 
		int num=0;
		int total=0;
		float result=0; //�Ǽ��� ����(��Ȯ�� ������)

		for(int i=0; i<box.length; i++) {
			//�� ��ȣ�� Ȧ����° ���ڵ��� ��
			if(i%2!=0) {
				sum1+=box[i];
			}
			//�ε��� ��ȣ�� 3�� ���&&�ε��� ��ȣ�� 0�� ���� �����Ѵ�(����)!!!
			if(i%3==0 && i!=0) {
				sum2+=box[i];
			}
			//box�迭�� ���� Ȧ���̸� num���� 1�� ������Ŵ
			//Ȧ���� ���� ������ ������ �ø�
			if(box[i]%2!=0) {
				num++;
			}
			
			total+=box[i];
		}
		//�ݺ��� �ۿ���
		result=(float)total/(float)box.length;//(���� �� ��ȯ)

		System.out.println("�ε���(���ȣ)�� Ȧ����°�� ������ �� : "+sum1);
		//61(3),48(6),7(9)�� �ո� ���ؼ� �ֿܼ� ���(�ε����� 3�� �����)
		System.out.println("�ε����� 3�� ����� ������ �� : "+sum2);
		//box�迭�� ���� Ȧ���� ������ ����(6)
		System.out.println("�迭�� ���� Ȧ���� ������ ���� : "+num);
		//box�迭�� ��� ���� ���� ���� box�迭�� ������ ���� ���� �ֿܼ� ���(box.length ���)
		System.out.println("�迭�� ������ ��� : "+result);
		
	}

}
