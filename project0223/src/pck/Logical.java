package pck;

public class Logical {

	public static void main(String[] args) {
		int i1=10;
		int i2=20;
		int i3=30;
		
		int i4=(i1+i2+i3)/3;
		System.out.println(i4);
		
		float f1=1.1f;
		float f2=3.7f;
		float f3=7.7f;
		
		float f4=(f1+f2+f3)/3.0f;
		System.out.println(f4);
		
		
		
		if(i4==f4) {
			System.out.println("값이 같다");
		}else {
			System.out.println("값이 다르다");
		}
		
		char b1='k';
		
		if((i4>=80)&&(b1=='k')) {
			System.out.println("k-culture");
		}else {
			System.out.println("culture");
		}

	}

}
