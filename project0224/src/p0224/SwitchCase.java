package p0224;

public class SwitchCase {

	public static void main(String[] args) {
		int ranking=1;
		char medalColor;
		
		//ranking������ ���� ���� �����ϰ� break������ switch~case�� ��������
		switch(ranking) {
		//racking������ ���� 1�� ���
		case 1:medalColor='G';
			  break;
		//racking������ ���� 2�� ���	  
		case 2:medalColor='S';
			  break;
		//racking������ ���� 3�� ���
		case 3:medalColor='B';
		      break;
		//racking������ ���� 1�� �ƴϰ�, 2�� �ƴϰ�, 3�� �ƴϸ� �⺻������ ����
		default:
			medalColor='A';
		}
		System.out.println(ranking+"�� �޴��� ������ "+medalColor+"�Դϴ�.");
	}

}
