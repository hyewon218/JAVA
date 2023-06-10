package object;

public class FunctionTest {

	public static void main(String[] args) {
		//정수형 변수 num1을 선언하고 10으로 초기화
		int num1=10;
		int num2=20;
		//add함수를 호출하면서 num1변수의 값과 num2변수의 값을 add함수로 넘기면
		//add함수에서 n1에 num1값을 저장하고, n2에 num2값을 저장함
		//add함수에서 계산된 결과값을 전달받아서 정수형 변수 sum에 저장
		int sum=add(num1,num2);
		System.out.println(num1+"+"+num2+"="+sum+"입니다.");

	}
	//반환값이 정수형인 add함수를 선언하고 매개변수 n1,n2생성함
	//n1에 num1값 전달받고, n2에 num2값 전달받아서 서로 더해서
	//정수형 변수 result에 저장한 다음 add함수를 호출한 곳으로 되돌려줌
	private static int add(int n1,int n2) {
		int result=n1+n2;
		return result;
	}

}

