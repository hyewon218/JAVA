package test;

import java.util.Scanner;

public class test04 {

	public static void main(String[] args) {
		// factorial(팩토리얼) 계산하기
		// 5!=1*2*3*4*5
		// 10!=1*2*3*4*5*6*7*8*9*10
		Scanner sc=new Scanner(System.in);
		System.out.print("factorial 정수 입력: ");
		int num=sc.nextInt();
		
		//곱하기 초기값 1나오도록!
		int res=1;
		//1~num까지 factorial계산(누적곱)
		//i=1..res=1*1
		//i=2..res=1*1*2
		//i=3..res=1*1*2*3
		//i=4..res=1*1*2*3*4
		//i=5..res=1*1*2*3*4*5
		for (int i=1; i<=num; i++) {
			//res=res*i;
			res*=i;
			//System.out.println("i="+i+", res="+res);
			//System.out.println();
			System.out.print(i);
			
		}
		System.out.println();
		System.out.println("----------------");
		System.out.println("1부터"+num+"까지의 곱하기="+res);
		sc.close();
	}
}

