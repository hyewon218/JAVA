package p0224;

public class SwitchCase {

	public static void main(String[] args) {
		int ranking=1;
		char medalColor;
		
		//ranking변수의 값에 따라 실행하고 break문으로 switch~case문 빠져나감
		switch(ranking) {
		//racking변수의 값이 1인 경우
		case 1:medalColor='G';
			  break;
		//racking변수의 값이 2인 경우	  
		case 2:medalColor='S';
			  break;
		//racking변수의 값이 3인 경우
		case 3:medalColor='B';
		      break;
		//racking변수의 값이 1도 아니고, 2도 아니고, 3도 아니면 기본값으로 설정
		default:
			medalColor='A';
		}
		System.out.println(ranking+"등 메달의 색깔은 "+medalColor+"입니다.");
	}

}
