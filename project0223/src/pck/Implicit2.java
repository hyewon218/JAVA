package pck;

public class Implicit2 {

	public static void main(String[] args) {
		float f1=7.093f;
		float f2=2.81f;
		
		int i1=(int)f1-(int)f2;
		//int i2=(int)f1*(int)f2;
		//float f3=f1*f2;
		int i2=(int)(f1*f2);
		
		
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(i1);
		System.out.println(i2);
	}

}
