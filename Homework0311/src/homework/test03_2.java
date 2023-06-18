package homework;

import java.util.Scanner;

public class test03_2 {

	public static void main(String[] args) {
		int sum=0;
		double avg=0.0;
		
		Scanner sc=new Scanner(System.in);
		System.out.print("생성할 배열의 크기를 입력하세요 : ");
		int num=sc.nextInt();
		int [] arr=new int[num];
		
		for(int i=0; i<arr.length; i++) {
			//정수를 키보드로 입력받아서 배열 arr에 저장
			System.out.print("배열에 저장할 변수 : ");
			arr[i]=sc.nextInt();
			//입력받은 숫자들의 합계
			sum+=arr[i];
		}
		avg=(double)sum/(double)(arr.length);
		
		System.out.print("입력받은 숫자 : ");
		for(int j=0; j<arr.length;j++) {
			if(j<arr.length-1) {
				System.out.print(arr[j]+",");
			}else {
				System.out.println(arr[j]);
			}
		}
		System.out.println();
		System.out.println("입력받은 숫자의 개수 : "+num);
		System.out.println("입력받은 숫자들의 합계 : "+sum);
		System.out.println("입력받은 숫자들의 평균 : "+avg);
		sc.close();
	}
}



