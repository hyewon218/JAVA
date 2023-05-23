package p0224;

public class Ex_02 {

	public static void main(String[] args) {
		
		char ch1='a';
		int key =1234;
		
		if((ch1=='a')&&(key==1234)) {
			System.out.println("로그인되었습니다");
		}else {
			System.out.println("로그인에 실패했습니다");
		}//
		if((ch1!='a')||(key!=1234)) {
			System.out.println("아이디나 비밀번호가 일치하지 않습니다");
		}else {
			System.out.println("로그인되었습니다");
		}//
		if(!(ch1=='a')) {
			System.out.println("아이디를 확인하세요");
		}else {
			System.out.println("비밀번호를 입력하세요");
		}
		
		
		

	}

}
