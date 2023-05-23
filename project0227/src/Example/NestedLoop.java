package Example;

public class NestedLoop {

	public static void main(String[] args) {
		//중첩 반복문(구구단)
		int dan;
		int times;
		//dan 변수는 2~9까지 8번 변함
		for(dan=2; dan<=9; dan++) {
			//dan이 1 증가할 때마다 times=1~9까지 변함
			//times변수는 1~9까지 9번 변함
			for(times=1; times<=9; times++) {
				//72번 반복함
				System.out.println(dan+"X"+times+"="+dan*times);
			}
			//빈 줄 출력
			System.out.println();
		}

	}

}
