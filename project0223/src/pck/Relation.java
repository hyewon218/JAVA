package pck;

public class Relation {

	public static void main(String[] args) {
		//관계 연산자
		int n1=-10;
		int n2=5;
		int res;
		
		if(n1>n2) {
			res=n1-n2;
		}else {
			res=n2-n1;
		}
			System.out.println("큰 값에서 작은 값 빼기:"+res);

	}

}
