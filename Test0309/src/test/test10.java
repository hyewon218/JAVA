package test;

import java.util.Scanner;

public class test10 {

	public static void main(String[] args) {
		
		//키보드로 정수 5개를 입력받아서 그 정수들을 콘솔에 출력하고
		//그 정수들의 합과 평균을 콘솔에 출력하시오(배열 사용)
		int[] num= new int[5];
		Scanner sc=new Scanner(System.in);
		int total=0;
		double avg=0.0;
		for(int i=0;i<num.length;i++) {
			//키보드로 정수 입력받아서 num배열에 저장
			System.out.print("정수 입력 : ");
			num[i]=sc.nextInt();
			//배열의 값을 더하기
			total +=num[i];
		}
		//avg=(Double)total/(Double)num.length;
		//콘솔에 배열의 값 출력
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}
	}
}

