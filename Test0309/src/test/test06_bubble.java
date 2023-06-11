package test;

public class test06_bubble {

	public static void main(String[] args) {
		//버블정렬 알고리즘(오름차순 기준)
		int imsi=0;
		int[] n= {6,9,1,10,3,5,7,2,8,4};
		//배열의 원본값 출력
		for(int i=0; i<n.length; i++) {
			System.out.print(n[i]+",");
		}
		System.out.println();
		System.out.println("========회전 결과=======");
		//버블정렬
		for(int i=1; i<n.length; i++) {
			System.out.println();
			System.out.println(i+"회전***");
			//-i : 횟수가 거듭될수록 비교대상 하나씩 줄어듦   
			for(int j=0; j<n.length-i; j++) {
				if(n[j]>n[j+1]) {//옆자리랑 비교 크면
					imsi=n[j];//오른쪽 값을 임시변수에 넣는다
					n[j]=n[j+1];
					n[j+1]=imsi;//임시변수에 있는 값을 왼쪽에 넣는다
				}
			}
			for(int k=0; k<n.length; k++) {
				System.out.print(n[k]+",");
			}
		}
		//정렬된값 출력
		System.out.println();
		System.out.println("========최종결과========");
		for(int i=0; i<n.length; i++) {
			System.out.print(n[i]+",");
		}
	}
}

//i=1(1회전),j=0,if(n[0]>n[1])...6>9--->false(자리안바꿈)
//i=1      ,j=1,if(n[1]>n[2])...9>1--->true(자리바꿈)
//i=1      ,j=2,if(n[2]>n[3])...9>10--->false(자리안바꿈)
//i=1      ,j=3,if(n[3]>n[4])...10>3--->true(자리바꿈)







