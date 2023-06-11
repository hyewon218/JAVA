package test;

import java.util.Scanner;

public class test11 {

	public static void main(String[] args) {
		// 고객명, 인원수, 좌석을 키보드로 받아서 출력하고, 총비용(인원수*좌석에 따른 가격)도 출력
		Scanner sc=new Scanner(System.in);
		String name="";
		int people=0;
		String sit="";
		int price=0;
		int total=0;
		System.out.print("고객명 :");
		name=sc.nextLine();

		System.out.print("인원수 :");
		people=sc.nextInt();
		sc.nextLine();
		System.out.print("좌석 :");
		
		sit=sc.nextLine();
		
		
		//sc.close();
		
		System.out.print(name);
		System.out.print(people);
		System.out.print(sit);
		
		if(sit.equals("R석")) {
			price=77000;
		}else if(sit=="OP석") {
			price=66000;
		}else if(sit=="S석") {
			price=55000;
		}else if(sit=="A석"){
			price=44000;
		}else {
			price=0;
		}
		
		total=people*price;
		System.out.println();
		System.out.println(sit);
		System.out.println("인원수 : "+people);
		System.out.println("가격 : "+price);
		System.out.println("총비용 : "+total);

	}

}
