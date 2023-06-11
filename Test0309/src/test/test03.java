package test;

import java.util.Scanner;

public class test03 {

	public static void main(String[] args) {
		//최대공약수, 최소공배수 구하기
		//최대공약수 : 두 개의 수가 있을 때 두 수의 공통된 약수 중 큰 값
		//최소공배수 : 두 개의 수가 있을 때 두 수의 공통된 배수 중 작은 값
		//최소공배수 = (수1*수2)/최대공약수
		
		Scanner sc=new Scanner(System.in);
		System.out.print("첫번째 숫자 입력:");
		int n1=sc.nextInt();
		System.out.print("두번째 숫자 입력:");
		int n2=sc.nextInt();
		//int n1=12;
		//int n2=18;
		int max=0;
		//나누기는 1부터!
		//12:1,2,3,4,6
		//18:1,2,3,6,8,18
		for(int i=1; i<=n1&&i<=n2; i++) {
			//공통된 약수구하기
			if(n1%i==0&&n2%i==0) {
				System.out.println(n1+"와(과) "+n2+"의 공약수는 "+i+"이다.");
				max=i;
			}
		}
		//최소공배수 구하기
		int res=(n1*n2)/max;
		System.out.println(n1+"와(과) "+n2+"의 최대공약수는 "+max+"이다.");
		System.out.println(n1+"와(과) "+n2+"의 최소공배수는 "+res+"이다.");
		sc.close();
	}
}

