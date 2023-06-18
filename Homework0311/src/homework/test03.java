package homework;

import java.util.ArrayList;
import java.util.Scanner;

public class test03 {

	public static void main(String[] args) {
		// 키보드로 1~100사이의 정수를 입력하고 배열에 저장한 다음,
		// 숫자 0(zero)을 입력하면 입력을 끝내고
		// 콘솔에 입력 받은 수들을 콘솔에 출력하고
		// 그 수들의 개수와 그 수들의 합계, 평균 구하기
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>(); 
		System.out.print("정수 입력 : ");

		int data;
		int sum=0;
		double avg = 0.0;
			
		while((data = sc.nextInt())>0) { 
			System.out.print("정수 입력 : ");
			list.add(data);
		}
		for(int i=0;i<list.size();i++) { 
			sum += list.get(i);
		}
		System.out.print("입력 받은 숫자:");
		for(int i=0;i<list.size();i++) { 
			if(i<list.size()-1) {
				System.out.print(list.get(i)+",");
			}else {
				System.out.print(list.get(i));
			}
		}
		avg =(double)sum/(double)list.size();
		System.out.println();
		System.out.println("입력받은 숫자의 개수 : " + list.size());
		System.out.println("입력받은 숫자들의 합계 : " + sum);
		System.out.println("입력받은 숫자들의 평균 : " + avg);
		sc.close();
	}
}

