package pck;

public class Calculator {

	public static void main(String[] args) {
		int n1=100;
		double n2=7.0;
		int tot=n1+(int)n2;
		//int sub=n1-n2;
		//int mul=n1*n2;
		//몫을 구하는 연산자(실수도 허용)
		double div=n1/n2;
		//나머지 구하는 연산자(정수만 구함)
		//int rest=n1%n2;
		
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(tot);
		//System.out.println(sub);
		//System.out.println(mul);
		System.out.println(div);
		//System.out.println(rest);
	}

}
