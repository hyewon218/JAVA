package ex;

import java.util.Scanner;

public class exam01 {

	public static void main(String[] args) {
		int price=0;
		String str="";
		Scanner sc=new Scanner(System.in);
		System.out.print("고객 이름 : ");
		String name=sc.nextLine();
		System.out.print("컵 종류(P:파인트,Q:쿼터,F:패밀리,H:하프갤런) : ");
		char cupType=sc.next().charAt(0);
		System.out.print("컵 개수 : ");
		int cupCount=sc.nextInt();
		
		
		switch(cupType) {
		case 'P':
			price=8200;
			str="파인트(3가지 맛)";
			break;
		case  'Q' :
			price=15500;
			str="쿼터(4가지 맛)";
			break;
		case  'F' :
			price=22000;
			str="패밀리(5가지 맛)";
			break;
		case  'H' :
			price=26500;
			str="하프갤런(6가지 맛)";
			break;
		default : 
			price=0;
			str="컵 종류가 없습니다.";
		}
		int res=price*cupCount;
		
		
		System.out.println();
		System.out.println("================");
		System.out.println("고객이름 : "+name);
		System.out.println("컵 종류 : "+str);
		System.out.println("컵 갯수 : "+cupCount+"개");
		System.out.println("가격 : "+res+"원");
		sc.close();

	}

}
