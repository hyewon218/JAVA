package Example;

public class ArrayEx02 {

	public static void main(String[] args) {
		
		int[] box= {59,20,35,61,79,83,48,100,16,7};
		
		int sum1=0;
		int sum2=0; 
		int num=0;
		int total=0;
		float result=0; //실수형 변수(정확한 값으로)

		for(int i=0; i<box.length; i++) {
			//방 번호가 홀수번째 숫자들의 합
			if(i%2!=0) {
				sum1+=box[i];
			}
			//인덱스 번호가 3의 배수&&인덱스 번호가 0인 것을 빼야한다(주의)!!!
			if(i%3==0 && i!=0) {
				sum2+=box[i];
			}
			//box배열의 값이 홀수이면 num값을 1씩 증가시킴
			//홀수를 만날 때마다 갯수를 늘림
			if(box[i]%2!=0) {
				num++;
			}
			
			total+=box[i];
		}
		//반복문 밖에서
		result=(float)total/(float)box.length;//(강제 형 변환)

		System.out.println("인덱스(방번호)가 홀수번째인 값들의 합 : "+sum1);
		//61(3),48(6),7(9)의 합만 구해서 콘솔에 출력(인덱스가 3의 배수임)
		System.out.println("인덱스가 3의 배수인 값들의 합 : "+sum2);
		//box배열의 값이 홀수인 숫자의 갯수(6)
		System.out.println("배열의 값이 홀수인 숫자의 갯수 : "+num);
		//box배열의 모든 값을 더한 다음 box배열의 개수로 나눈 몫을 콘솔에 출력(box.length 사용)
		System.out.println("배열의 값들의 평균 : "+result);
		
	}

}
