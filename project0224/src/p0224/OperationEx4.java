package p0224;

public class OperationEx4 {

	public static void main(String[] args) {
		int fatherAge=45;
		int motherAge=47;
		char ch;
		//fatherAge���� matherAge������ ũ�� 'T', �۰ų� ������ 'F'
		//������� ch������ ����, ch='F'
		ch=(fatherAge>motherAge) ? 'T' : 'F';
		System.out.println(ch);
		
		if(fatherAge>motherAge) {
			ch='T';
		}else {
			ch='F';
		}
		System.out.println(ch);
	}
}
