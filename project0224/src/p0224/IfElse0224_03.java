package p0224;

public class IfElse0224_03 {

	public static void main(String[] args) {
		int i1=30;
		int i2=50;
		int i3=90;
		char result;
		
		int i4=i1+i2+i3;
		int i5=i4/3;
		
		System.out.println(i4);
		System.out.println(i5);
		
		if(i5>=90) {
			result='A';
			
		}else if(i5>=80){
			result='B';
		}else if(i5>=70) {
			result='C';
		}else if(i5>=60) {
			result='D';
		}else {
			result='F';
		}
		System.out.println(result);
	}

}
