package test;

import java.util.Scanner;

public class test09 {

	public static void main(String[] args) {
		// 정수를 입력받아서 1~정수 사이의 소수와 소수의 개수와 소수의 합 구하기
		// 소수란? 1보다 큰 자연수 중 1과 그 수 자기 자신만을 약수로 갖는 자연수
		// 소수의 예 : 2,3,5,7,11,13,17,19,23...
		// 소수 구하는 알고리즘 예:숫자 6이라면 6%2=0이므로 소수가 아니고(약수가 자기자신,2)
		// 숫자 7이라면 7%2!=0, 7%3!=0, 7%4!=0, 7%5!=0, 7%6!=0이므로
		// 소수이다
		int imsi = 0;// 약수(1부터)의 개수(약수가 없어야 소수임)
		int count = 0;// 소수의 갯수
		int total = 0;// 소수의 합
		Scanner sc = new Scanner(System.in);
		System.out.print("10~100 사이의 정수 입력 : ");
		int num = sc.nextInt();
		
		//정수 2부터 시작해서 키보드로 입력받은 수(num)까지 반복
		for (int k=2; k<=num; k++) {
			//k값의 약수의 개수 초기화
			imsi=0;
			//정수 1부터 k보다 작거나 같을 때까지 i값을 1씩 증가시킴
			//=:자기자신 추가
			for (int i=1; i<=k; i++) {
				//만약 k값을 i값으로 나눈 나머지가 0이면
				if (k%i==0) {
					//k값의 약수의 개수를 1 증가시킴
					imsi++;
					//콘솔에 k변수의 약수 출력
					System.out.print(k+"의 약수="+i+",");
					System.out.println();
				//k값을 i값으로 나눈 나머지가 0이 아니라면	
				}else {
					//다시 for i문으로 돌아가서 계속 반복문 실행
					continue;
				}
			}
			//만약 k변수값의 약수의 개수가 2라면
			if (imsi==2) {
				//소수인 숫자 k값 출력
				System.out.println("소수" + k);
				// 소수의 개수 1 증가
				count++;
				// 소수들의 합계
				total += k;
			}
			System.out.println(k+"의 약수의 개수(imsi변수)="+imsi);
			System.out.println();
		}
		System.out.println("================================");
		System.out.println("소수의 갯수="+count);
		System.out.println("소수의 합계="+total);
		sc.close();
	}
}

