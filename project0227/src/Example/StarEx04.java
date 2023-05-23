package Example;

public class StarEx04 {

	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++) {
			//공백처리
			//1일때 1~4까지 
			for(int j=1; j<=5-i; j++) {
				System.out.print(" ");
			}
			//별찍기
			for(int k=1; k<=i+(i-1); k++) {
				System.out.print("*");
			}
	
			System.out.println();
			
		}
		

	}

}
