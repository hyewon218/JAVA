package Example;

public class DoWhileEx {

	public static void main(String[] args) {
		int num=1;
		int sum=0;
		//while문과 do~while문의 차이는 do~while문은 do{}실행문을 반드시 1번은 실행함.
		do {
			sum+=num;
			num++;
			
		}while(num<=10);
		
		System.out.println("1부터 10까지의 합은: "+sum);
	}

}
