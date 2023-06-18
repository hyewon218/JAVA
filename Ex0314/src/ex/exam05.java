package ex;

import java.util.Scanner;

public class exam05 {
	Scanner sc=new Scanner(System.in);
	private String name=sc.nextLine();
	private String discountType=sc.nextLine();
	private int age=sc.nextInt();
	

	//private String name;
	//private int age;
	//private String discountType;
	public exam05() {
		
	}
	//public exam05(String name, int age, String discountType) {
	//	this.name = name;
	//	this.age = age;
	//	this.discountType = discountType;
	//}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getDiscountType() {
		return discountType;
	}
	public String getRank() {
		String str="";
		if(age>=13) {
			str="13세 이상";
		}else {
			str="13세 이상만 관람 가능합니다.";
		}
		return str;
	}

	public void showInfo() {
		int price = 65000;
			if (discountType.equals("-50%할인권소지자")) {
				price = 32500;
				
			} else if (discountType.equals("마티네할인")) {
				price = 45500;
			} else if (discountType.equals("재관람할인")) {
				price = 45500;
			} else if (discountType.equals("MJStarfish")) {
				price = 58750;
			} else if (discountType.equals("장애인/국가유공자할인")) {
				price = 32500;
			} else {
				price = 0;
			}
	
		System.out.println("관람객 : "+name);
		System.out.println("등급 : "+getRank());
		System.out.println("할인권 : "+discountType);
		System.out.println("할인율이 적용된 가격 : "+price);
		
	}
}
