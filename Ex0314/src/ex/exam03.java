package ex;

import java.util.Scanner;

public class exam03 {

	public static void main(String[] args) {
		//키보드로 학생이름과 나이 입력받아서 나이에 맞는 도서 추천하는 프로그램
		String str="";
		
		Scanner sc=new Scanner(System.in);
		System.out.print("학생이름 : ");
		String name=sc.nextLine();
		System.out.print("나이 : ");
		int age=sc.nextInt();
		
		if(age>=0&&age<=3) {
			str="완두콩 동그라미";
		}else if(age>=4&&age<=7) {
			str="싫어요싫어요";
		}else if(age>=7&&age<=9) {
			str="어린이를 위한 첫 발명 수업";
		}else if(age>=10&&age<=11) {
			str="어린이를 위한 첫 발명 수업";
		}else if(age>=12&&age<=13){
			str="스마트폰이 생겼어요";
		}
		System.out.println("학생이름 : "+name);
		System.out.println("학생나이 : "+age+"세");
		System.out.println("추천도서 : "+str);
		sc.close();
	}

}
