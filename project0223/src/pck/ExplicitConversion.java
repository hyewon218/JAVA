package pck;

public class ExplicitConversion {

	public static void main(String[] args) {
		double dNum1=1.2;
		float fNum2=0.9f;
		
		//두 실수가 각각 형 변환되어 더해짐(1+0)
		int iNum3=(int)dNum1+(int)fNum2;
		//두 실수의 합이 먼저 계산되고 형 변환됨(2.1)
		int iNum4=(int)(dNum1+fNum2);
		System.out.println(iNum3);
		System.out.println(iNum4);
	}

}
