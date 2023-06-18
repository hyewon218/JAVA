package ex;

public class exam04_test {

	public static void main(String[] args) {
		// 클래스와 main클래스로 작성하기
		//학생 이름과 학생 나이는 클래스 안에서 키보드로 입력받기
		//출력 형식은 문제 3번과 동일
		System.out.println("학생이름 : ");
		System.out.println("나이 : ");
		
		exam04 exam=new exam04();
		exam.getBook();
	}

}
