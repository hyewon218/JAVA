package test;

import java.util.Scanner;

public class test05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("factorial 정수 입력: ");
		int num=sc.nextInt();
		// num변수의 값을 전달하면서 fact함수 호출
		System.out.println(fact(num));
		sc.close();
	}

	// static : 정적인 객체 생성, Heap메모리가 아닌 Static(정적)메모리에 할당됨
	// 현재 프로그램 종료할 때까지 메모리에 할당된 채로 존재함
	// 모든 객체가 이 영역을 언제 어디서든 참조할 수 있음
	public static int fact(int n) {
		int res=1;
		if (n<=1) {
			return res;
		} else {
			//재귀함수(함수에서 자기 자신을 다시 호출함)
			res=fact(n-1)*n;//5*4*3*2*1
			return res;
		}
	}
	//public static int fact(int n) {
	//	if (n<=1) {
	//		return n;
	//	} else {
			//재귀함수(함수에서 자기 자신을 다시 호출함)
	//		return fact(n-1)*n;
	//	}
	//}
}



