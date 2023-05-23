package p0224;

public class Example0224_01 {

	public static void main(String[] args) {
		int num=1;
		int res=0;
		int out =0;
		
		//증가시킨 다음에 대입
		res=++num;
		System.out.println(num);
		System.out.println(res);
		
		//대입한 다음 증가시킴
		res=num++;
		System.out.println(num);
		System.out.println(res);
		
		//감소시킨 다음에 대입
		out =--num;
		System.out.println(num);
		System.out.println(out);
		
		//대입한 다음 감소시킴
		out =num--;
		System.out.println(num);
		System.out.println(out);
		

	}

}
