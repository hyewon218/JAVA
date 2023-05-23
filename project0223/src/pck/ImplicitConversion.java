package pck;

public class ImplicitConversion {

	public static void main(String[] args) {
		//byte형(1byte)으로 bNum이라는 변수를 선언하고 10을 저장-큰 그릇에 옮겨담음
		byte bNum=10;
		//묵시적 형 번환
		int iNum=bNum;
		
		System.out.println(bNum);
		System.out.println(iNum);
		
		int iNum2=20;
		//묵시적 형 변환
		float fNum=iNum2;
		
		System.out.println(iNum);
		System.out.println(fNum);
		
		double dNum;
		dNum=fNum+iNum;
		System.out.println(dNum);
		
		System.out.println("------------------------");
		
		char s1='문';
		int n1=s1;
		
		float f1=57.9f;
		
		char s2=(char)f1;
		int n2=s2;
		
		System.out.println(s1);
		System.out.println(n1);
		System.out.println(s2);
		System.out.println(n2);

		
	}

}
