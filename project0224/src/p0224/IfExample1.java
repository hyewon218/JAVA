package p0224;

public class IfExample1 {

	public static void main(String[] args) {
		int age=7;
		
		if(age>=8) {
			System.out.println("�б��� �ٴմϴ�.");
		}
		
		if(age>=8) {
			System.out.println("�б��� �ٴմϴ�.");
		}else {
			System.out.println("��ġ���� �ٴմϴ�.");
		}//��ø if��
		//8�� �̻��̸� �б��� �ٴմϴ�.
		if(age>=8) {
			System.out.println("�б�");
		}else {
			//5�� �̻�~8�� �̸��̸� ��ġ���� �ٴմϴ�.
			if(age>=5) {
				System.out.println("��ġ��");
			}else {
				System.out.println("�����");
			}
			
		}

	}

}
