package ex0307;

public class ArrayEx {
	public static void main(String[] args) {
		//배열 길이가 5인 정수형 배열을 선언하고
		//1~10 중에서 짝수만 배열에 저장하고 출력
		//int[] num=new int[] {2,4,6,8,10};
		int a=0;//방번호
		int total=0;
		int[] num=new int[5]; 
		//1~10까지 1씩 증가(10번 반복)
		//i=1, a=0
		//i=2, num[0]=2, a=1
		//i=3, a=1
		//i=4, num[1]=4, a=2
		//i=5, a=2
		//i=6, num[2]=6, a=3
		//i=7, a=3
		//i=8, num[3]=8, a=4
		//i=9, a=4
		//i=10, num[4]=10, a=5
		for(int i=1; i<=10; i++) {
			//1~10의 자연수 중에서 짝수만 조사
			if(i%2==0) {
				num[a]=i;
				//배열의 값을 total에 더하기
				total+=num[a];
				//배열의 인덱스 번호
				a++;
			}
		}
		//배열의 값을 콘솔에 출력
		for(int j=0; j<num.length; j++) {
			total += num[j];
			System.out.println("num["+j+"]="+num[j]);
		}	
		System.out.println("배열 값의 합:"+total);
	}
}


