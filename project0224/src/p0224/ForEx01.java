package p0224;

public class ForEx01 {

	public static void main(String[] args) {
		//for문(반복문)
		//int num1; 정수형 변수 선언 및 1로 초기화(시작값)
		//num<=10; 조건문(마지막 값을 설정)
		//num++ -> num변수의 값을 1씩 증가시킴
		for(int num=1; num<=10; num++) {
			System.out.println("번호 "+num);
		}
		System.out.println("------------");
		//(시작값:2,마지막값:10,증가값:2)
		for(int num=2; num<=10; num+=2) {
			System.out.println("번호 "+num);
		}
		System.out.println("------------");
		//1,3,5,7,9
		for(int num=1; num<=10; num+=2) {
			System.out.println("번호 "+num);
		}
		System.out.println("------------");
		
		for(int num=10; num>=1; num--) {
			System.out.println("번호 "+num);
		}
		System.out.println("------------");
		
		for(int num=1; num<=5; num++) {
			System.out.println("도깨비");
		}
		System.out.println("------------");


	}

}
