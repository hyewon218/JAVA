package homework;

public class test04_random {

	public static void main(String[] args) {
		// 1~100사이의 무작위 정수(랜덤)을 10개 발생시켜 배열에 저장한 다음 그 수들을 출력하고,
		// 배열의 값들 중에서 3의 배수이거나 5의 배수인 숫자를 골라서 출력하고
		// 3의 배수이거나 5의 배수인 숫자들의 개수와 합계도 출력하기
		// 100까지 랜덤한 수 발생시키기 : (int)(Math.random()*100)
		// Random rand=new Random();
		int sum = 0;
		int count = 0;
		int[] num = new int[10];
		System.out.print("랜덤숫자 : ");
		for (int i=0; i<num.length; i++) {
			num[i]=(int)(Math.random()*99)+1;
			if (i<num.length-1) {
				System.out.print(num[i]+",");
			} else {
				System.out.println(num[i]);
			}
		}
		System.out.println("---------------------------------------------");
		System.out.print("배열 값 중 3의 배수이거나 5의 배수인 수 :");
		for (int i=0; i<num.length; i++) {
			if (num[i]%3==0||num[i]%5==0) {
				count++;
				sum += num[i];
				System.out.print(num[i]+",");
			}
		}
		System.out.println();
		System.out.println("배열 값 중 3의 배수이거나 5의 배수인 수들의 개수 :" + count);
		System.out.println("배열 값 중 3의 배수이거나 5의 배수인 수들의 합계 :" + sum);
	}
}

