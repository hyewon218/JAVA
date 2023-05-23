package home;

public class HomeWork06 {

	public static void main(String[] args) {
		
		for(int a=1; a<=5; a++) {		//행 회전(가로)
			for(int b=1; b<=5; b++) {	//열 회전(세로)
				System.out.print(a); //a가 한번 돌 때 b가 다섯번 돈다.
			}						 //b가 5번 반복할 동안에 a가 1번 증가
			System.out.println();
		}
		System.out.println();
		
		for(int i=1; i<=5; i++) {		//행 회전(가로)
			for(int j=1; j<=5; j++) {	//열 회전(세로)
				System.out.print(j); //j가 5번 돌 때 i는 한번만 돈다.
			}						 //i가 1번 반복할 동안에 j는 5번 증가
			System.out.println();
		}
	}

}

