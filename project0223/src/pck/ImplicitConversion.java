package pck;

public class ImplicitConversion {

	public static void main(String[] args) {
		//byte��(1byte)���� bNum�̶�� ������ �����ϰ� 10�� ����-ū �׸��� �Űܴ���
		byte bNum=10;
		//������ �� ��ȯ
		int iNum=bNum;
		
		System.out.println(bNum);
		System.out.println(iNum);
		
		int iNum2=20;
		//������ �� ��ȯ
		float fNum=iNum2;
		
		System.out.println(iNum);
		System.out.println(fNum);
		
		double dNum;
		dNum=fNum+iNum;
		System.out.println(dNum);
		
		System.out.println("------------------------");
		
		char s1='��';
		int n1=s1;
		
		float f1=57.9f;
		
		char s2=(char)f1;
		int n2=s2;
		
		System.out.println(s1);
		System.out.println(n1);
		System.out.println(s2);
		System.out.println(n2);

		
	}

}
