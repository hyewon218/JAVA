package p0224;

public class Ex_02 {

	public static void main(String[] args) {
		
		char ch1='a';
		int key =1234;
		
		if((ch1=='a')&&(key==1234)) {
			System.out.println("�α��εǾ����ϴ�");
		}else {
			System.out.println("�α��ο� �����߽��ϴ�");
		}//
		if((ch1!='a')||(key!=1234)) {
			System.out.println("���̵� ��й�ȣ�� ��ġ���� �ʽ��ϴ�");
		}else {
			System.out.println("�α��εǾ����ϴ�");
		}//
		if(!(ch1=='a')) {
			System.out.println("���̵� Ȯ���ϼ���");
		}else {
			System.out.println("��й�ȣ�� �Է��ϼ���");
		}
		
		
		

	}

}
