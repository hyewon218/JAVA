package Example;

public class WhileEx1 {

	public static void main(String[] args) {
		//누적합(1+2+3+4+5+6+7+8+9+10=55)
		int num=1;
		int sum=0;
		
		while(num<=10) {
			//sum=sum+num;
			sum+=num;
			num++;			
			System.out.println(num);
		}
		System.out.println(num);
		System.out.println("1부터 10까지의 합은 "+sum+"입니다.");
	}

}
