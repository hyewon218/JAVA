package Example;

public class forEx2 {

	public static void main(String[] args) {
		
		int sum=0;
		//i변수의 값은 1부터 시작해서 하나씩 증가하다가 100보다 커지면 for문 빠져나감
		for(int i=1;i<=100;i++) {
			/*
			 * if(i%2 !=0) continue;
			 */
			//만약 i변수의 값을 2로 나눈 나머지가 0이라면 
			if(i%2==0) {
				//2의 배수를 sum변수에 계속 더함(누적합)
				sum+=i;
				//i변수의 값을 콘솔에 출력
				System.out.println(i);
			}
		}
		System.out.println();
		//2의 배수의 합을 콘솔에 출력
		System.out.println("1~100 수 중 2의 배수의 합"+sum);
	}

}
