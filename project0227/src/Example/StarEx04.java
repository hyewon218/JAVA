package Example;

public class StarEx04 {

	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++) {
			//����ó��
			//1�϶� 1~4���� 
			for(int j=1; j<=5-i; j++) {
				System.out.print(" ");
			}
			//�����
			for(int k=1; k<=i+(i-1); k++) {
				System.out.print("*");
			}
	
			System.out.println();
			
		}
		

	}

}
