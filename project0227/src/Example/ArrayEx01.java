package Example;

public class ArrayEx01 {

	public static void main(String[] args) {
		//str�迭�� ������ ����
/*		String str="���,������,����,�ڸ�,���θӽ���,õ����";
		String [] arr=str.split(",");*/
		int num=0;
		String [] str= {"���","������","����","�ڸ�","���θӽ���","õ����"};
 		int total=str.length;
		
		for(int i=0; i<str.length; i++) {
			System.out.println("str["+i+"]="+str[i]);
			//���� str�迭�� ���� "�ڸ�"�̸� �� �迭�� �ε��� ��ȣ�� num�� ����
			if(str[i]=="�ڸ�") {
				num=i;
			}
		}
		//4��°
		System.out.println();
		System.out.println("���� �����ϴ� ������ "+(num+1)+"�� "+str[3]+"�̴�.");
		System.out.println("���� �����ϴ� ������ �� "+total+"�����̴�.");
		System.out.println();
		str[5]=str[5].replaceAll("õ����", "������");

		for(int i=0; i<str.length; i++) {
			System.out.println(str[i]);
		}
		
		
	}

}
