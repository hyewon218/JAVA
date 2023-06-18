package ex;

import java.util.Scanner;
import java.io.IOException;

public class exam02 {

	//@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) throws IOException {
		//키보드로 아이스크림 종류를 입력받아서 콘솔에 출력하기
		//키보드로 end를 입력받으면 프로그램 끝내기
		//for문 사용하지 않음. while문 사용, if문 사용, break나 continue사용 가능
		boolean b=true;
		String icecream="";
		int keycode=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.print("아이스크림 종류 : ");
		
		while (keycode!=13) {
			icecream=sc.nextLine();
			keycode=System.in.read();
			if(keycode==13) {
				b=!b;
			}
		}
		System.out.print("아이스크림 종류 : "+icecream);
		sc.close();
	}

}
