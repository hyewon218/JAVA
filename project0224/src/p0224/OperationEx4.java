package p0224;

public class OperationEx4 {

	public static void main(String[] args) {
		int fatherAge=45;
		int motherAge=47;
		char ch;
		//fatherAge값이 matherAge값보다 크면 'T', 작거나 같으면 'F'
		//결과값을 ch변수에 저장, ch='F'
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
