package ex;

public class exam02 {

	public static void main(String[] args) {
		//배열5개 만들고 그 안에 1~10까지의 무작위 정수를 발생시켜 배열에 저장한 다음
		//그 배열 값들의 곱샘한 결과를 출력하기
		//<출력 형식>
		//배열 5개 : 7,4,3,1,5
		//배열 값들의 곱한 결과 :420
		int gop=1;
		int[] num=new int[10];
		System.out.print("배열 5개 : ");
		for(int i=0; i<5; i++) {
			//0<=Math.random()<1
			//Math.random():0~1까지의 무작위 수를 발생(1은 포함안됨)
			//Math.random()*9 : 0*9 ~ 1*9 => 0~9
			//Math.random()*9+1 : 0*9+1 ~ 1*9+1 => 1~10
			//Math.round(값) : 소수 첫번째 자리에서 반올림
			num[i]=(int)Math.round((Math.random()*9+1));
			gop*=num[i];
			System.out.print(num[i]+",");
		}
		System.out.println();
		System.out.print("배열 값들의 곱한 결과 : "+gop);
	}
}

