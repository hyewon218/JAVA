package ex;

import java.util.Scanner;

public class exam04 {

	public static void main(String[] args) {
		//배열 6개를 만들고 알파벳 대문자를 키보드로 입력받아서 배열에 저장한 다음
		//그 대문자의 아스키코드 값을 콘솔에 출력하고
		//아스키 코드값의 합계도 출력하기
		int total=0;
		char[] ch=new char[6];
		Scanner sc=new Scanner(System.in);
	
		for(int i=0; i<ch.length; i++) {
			System.out.print("입력받은 문자 : ");
			//키보드로 입력한 문자(한글자)를 배열에 저장할 때
			ch[i]=sc.next().charAt(0);
		}
		System.out.println();
		System.out.println("아스키 코드값 : ");
		for(int i=0; i<ch.length; i++) {
			System.out.print((int)ch[i]+",");
			total+=(int)ch[i];
		}
		System.out.println();
		System.out.println("아스키 코드 값들의 합계 : "+total);
		sc.close();
	}
}


