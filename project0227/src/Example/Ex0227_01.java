package Example;

public class Ex0227_01 {

	public static void main(String[] args) {

		
		int i=25;
		float f=8.07f;
		double f1=12.9;
		char c='Z';
		
		
		int i2=(int)f;
		int i3=(int)f1;
		int i4=i+i2+i3;
		
		System.out.println(i2);
		System.out.println(i3);	
		System.out.println(i4);	
		
		System.out.println();
		
		if(c=='Z') {
			System.out.println("MZ세대입니다");
		}else {
			System.out.println("MZ세대가 아닙니다");
		}
		
		System.out.println();
		
		for(i=1;i<=10;i++) {
			System.out.println("짜파게티"+i+"봉");
		}
		
	}

}
