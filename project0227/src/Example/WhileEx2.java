package Example;

public class WhileEx2 {

	public static void main(String[] args) {
		
		//10~30 의 2의 배수들의 합(10+...+30)
		int num=8;
		int sum=0;
		
		while(num<30) {
			//sum=sum+num;
			num+=2;
			sum+=num;
			System.out.println(num);
		}
		
		System.out.println(num);
		System.out.println("10부터 30까지의 2의배수의 합은 "+sum+"입니다.");

		
	}

}
