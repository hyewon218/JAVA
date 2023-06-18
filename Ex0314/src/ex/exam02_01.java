package ex;

import java.util.Scanner;

public class exam02_01 {

	public static void main(String[] args) {

		// 키보드로 아이스크림 종류를 입력받아서 콘솔에 출력하기
		// 키보드로 end를 입력받으면 프로그램 끝내기
		// for문 사용하지 않음. while문 사용, if문 사용, break나 continue사용 가능
		boolean b = true;
		String icecream = "";

		Scanner sc = new Scanner(System.in);
		//System.out.print("아이스크림 종류 : ");

		while (!icecream.equals("end")) {
			System.out.print("아이스크림 종류 : ");
			icecream = sc.nextLine();
			if (icecream.equals("end")) {
				System.out.println("끝");
				break;
			}
			System.out.println("아이스크림 종류 : " + icecream);
		}
		
		sc.close();
	}

}
