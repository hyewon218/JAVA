package homework;

import java.util.Scanner;

public class test01 {

	public static void main(String[] args) {
		//5개의 수를 키보드로 입력받아서 배열에 저장한 다음
		//그 수들 중 최대값과 최소값을 구하여 출력하기 
		int max=0;//(-포함하면 :-999로 초기화)
		int min=999;
		Scanner sc=new Scanner(System.in);
		int[] num=new int[5];
		
		for(int i=0; i<num.length; i++) {
			System.out.print("정수 입력["+i+"]:");
			num[i]=sc.nextInt();//키보드로 입력받은 변수를 배열에 넣음
			if(max<num[i]) {
				max=num[i];
			}
			if(min>num[i]) {
				min=num[i];
			}
		}
		System.out.println();
		System.out.print("배열의 값 : ");
		for(int j=0; j<num.length; j++) {
			if(j<num.length-1) {
				System.out.print(num[j]+",");
			}else {
				System.out.println(num[j]);
			}
		}
		System.out.println();
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);
		sc.close();
	}
}

