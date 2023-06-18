package ex;

import java.util.Scanner;

public class exam04 {
		Scanner sc=new Scanner(System.in);
		private String name=sc.nextLine();
		private int age=sc.nextInt();
		
		
		public exam04() {
			
		}
	
		public void getBook() {
		String str="";
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
