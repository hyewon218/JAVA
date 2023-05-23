package p0224;

public class IfExample1 {

	public static void main(String[] args) {
		int age=7;
		
		if(age>=8) {
			System.out.println("학교에 다닙니다.");
		}
		
		if(age>=8) {
			System.out.println("학교에 다닙니다.");
		}else {
			System.out.println("유치원에 다닙니다.");
		}//중첩 if문
		//8세 이상이면 학교에 다닙니다.
		if(age>=8) {
			System.out.println("학교");
		}else {
			//5세 이상~8세 미만이면 유치원에 다닙니다.
			if(age>=5) {
				System.out.println("유치원");
			}else {
				System.out.println("어린이집");
			}
			
		}

	}

}
