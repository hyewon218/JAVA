package p0224;

public class switchCase0224_05 {

	public static void main(String[] args) {
		int num=11;
		int res=0;
		
		res=num%2;
		
		switch(res) {
		
		case 0:
			System.out.println("짝수입니다");
			break;
		case 1:
			System.out.println("홀수입니다.");
			break;
		default:
			System.out.println("숫자가 아닙니다");
		}
	}

}
