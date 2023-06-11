package test;

import java.util.Scanner;

public class test12 {

	public static void main(String[] args) {
		//키보드로 정수 10개를 입력받아서 오름차순으로 정렬(버블정렬)하여
		//콘솔에 출력하고, 가장 작은 수와 가장 큰 수를 뺀 나머지 숫자들의 평균을 구해서 출력(배열)
		Scanner sc=new Scanner(System.in);
		int a,b,c,d,e,f,g,h,i,j;
		int min=999;
		int max=0;
		int sum=0;
		double avg=0.0;
		//int cnt=0;
		System.out.print("숫자1 : ");
		a=sc.nextInt();
		System.out.print("숫자2 : ");
		b=sc.nextInt();
		System.out.print("숫자3 : ");
		c=sc.nextInt();
		System.out.print("숫자4 : ");
		d=sc.nextInt();
		System.out.print("숫자5 : ");
		e=sc.nextInt();
		System.out.print("숫자6 : ");
		f=sc.nextInt();
		System.out.print("숫자7 : ");
		g=sc.nextInt();
		System.out.print("숫자8 : ");
		h=sc.nextInt();
		System.out.print("숫자9 : ");
		i=sc.nextInt();
		System.out.print("숫자10 : ");
		j=sc.nextInt();
		
		int imsi=0;
		//int[] n=new int[10];
		int[] n= {a,b,c,d,e,f,g,h,i,j};

		for(int k=1;k<n.length; k++ ) {
			for(int l=0;l<n.length-k;l++) {
				if(n[l]>n[l+1]) {
					imsi=n[l];
					n[l]=n[l+1];
					n[l+1]=imsi;
				}
			}
			
		}
		for(int k=0;k<n.length; k++) {
			System.out.print(n[k]+",");
		}
		//최소값, 최대값
		for(int m=0;m<n.length; m++) {
			if(n[m]<min) {
				min=n[m];
			}
			if(n[m]>max) {
				max=n[m];
			}			
			sum+=n[m];
		}
		sum=sum-(max+min);
		//강제형변환!
		avg=sum/8;
		System.out.println();
		System.out.println("최소값:"+min);
		System.out.println("최대값:"+max);
		System.out.println("합:"+sum);
		System.out.println("평균:"+avg);
	}
}









