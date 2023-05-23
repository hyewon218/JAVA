package pck;

public class AddSub {

	public static void main(String[] args) {
		int num=10;
		//전위 증가 연산자(덧셈을 하고 나서 res1에 결과 저장)
		int res1= ++num;//11
		System.out.println(res1);
		//전위 감소 연산자(뺄셈을 하고 나서 res2에 결과 저장)
		int res2= --num;//10
		System.out.println(res2);
		//후위 증가 연산자(res3에 값을 저장한 후에 더하기)
		int res3 = num++;//10
		System.out.println(res3);
		//후위 감소 연산자(res4에 값을 저장한 후에 빼기)
		int res4 =num--;//11
		System.out.println(res4);
		
		int res5=num;//10
		System.out.println(res5);
		

	}

}
