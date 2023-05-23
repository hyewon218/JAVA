package home;

public class HomeWork02 {

	public static void main(String[] args) {
		
		int num=0;
		int sum=0;
		
		for(int i=1; i<=100; i++) {
			if(i%3==0||i%4==0) {
				num++;
				sum+=i;
			}
		}
		
		float avg=(float)sum/num;
		
		System.out.println("1~100까지의 정수 중에서 3의 배수이거나 4의 배수인 수들의 개수 : "+num);
		System.out.println("1~100까지의 정수 중에서 3의 배수이거나 4의 배수인 수들의 합 : "+sum);
		System.out.println("1~100까지의 정수 중에서 3의 배수이거나 4의 배수인 수들의 평 : "+avg);

	}

}
