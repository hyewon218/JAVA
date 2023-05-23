package pck;

public class exImplicit {

	public static void main(String[] args) {
		
		int n1=10;
		float f1=5.7f;
		double d1=9.3;
		char c1='개';
		
		//실수형 변수 2개는 정수형으로 형변환하여 더한 다음 결과값을 콘솔에 출력
		int n2=(int)f1+(int)d1;
		//정수형 변수값을 실수형으로 형변환하여 콘솔에 출력
		float f2=(float)n1;
		
		System.out.println(f2);
		System.out.println(n2);
		System.out.println((int)c1);

	}

}
