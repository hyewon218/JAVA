package pck;

public class Ex1 {

	public static void main(String[] args) {
		int num;
		num=-5+3*10/2;
		System.out.println(num);
		
		System.out.println("--------------------");
		
		int num2=10;
		System.out.println(num2);
		System.out.println(num2++);
		System.out.println(num2);
		System.out.println(--num2);
		
		System.out.println("-----------------------");
		
		int num3=10;
		int num4=20;
		boolean result;
		
		result=((num3>10)&&(num4>10));
		System.out.println(result);
		result=((num3>10)||(num4>10));
		System.out.println(result);
		System.out.println(!result);

		System.out.println("----------------------------");
		
		int num5=2;
		int num6=10;
		
		System.out.println(num5&num6);
		System.out.println(num5|num6);
		System.out.println(num5^num6);
		System.out.println(~num);
		
		System.out.println("-------------------");
		
		int num7=8;
		System.out.println(num7+=10);
		System.out.println(num7-=10);
		System.out.println(num7>>=2);
		
		int num8=10;
		int num9=20;
		
		int result2=(num8>=10)?num9+10:num9-10;
		System.out.println(result2);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
