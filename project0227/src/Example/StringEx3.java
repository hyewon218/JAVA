package Example;

public class StringEx3 {

	public static void main(String[] args) {
		String arr="김밥,라면,우동,돈가스,만두";
		//split()는 특정 문자로 구분하여 문자열을 나누어서 배열에 저장함
		//[]:배열
		//res[0]="김밥",res[1]="라면",res[2]="우동"
		//res[3]="돈가스",res[4]="만두"
		String[] res=arr.split(",");
		
		//length()는 res배열의 개수를 구하는 메서드(0,1,2,3,4)
		System.out.println("res배열의 개수:"+res.length);
		
		//res배열의 개수만큼 반복, i변수는 인덱스번호를 나타냄
		//for(int i=0; i<=res.length-1; i++) {
		for(int i=0; i<res.length; i++) {
			System.out.println(i+","+res[i]);
		}
		//System.out.println(i+","+res[0]);
		//System.out.println(i+","+res[1]);
		//System.out.println(i+","+res[2]);
		//System.out.println(i+","+res[3]);
		//System.out.println(i+","+res[4]);
		
	}

}
