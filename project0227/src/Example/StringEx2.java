package Example;

public class StringEx2 {

	public static void main(String[] args) {
		//문자열형 변수 선언 및 초기화
		String str1="Have a good time!";
		//문자열은 객체로 생성된다.
		//new: 객체를 생성한다는 뜻의 키워드
		//객체는 반드시 대문자로 시작해야 함(문법)
		String str2=new String("즐거운 시간 되세요!");
		
		String str3="javascript";
		String str4="java";
		String str5="java";
		String str6="abcdefghijklmn";
		
		System.out.println(str1);
		System.out.println(str2);
		
		//equals()는 문자열이 같은지 비교하는 메서드
		System.out.println(str3.equals(str4));
		System.out.println(str4.equals(str5));
		//IndexOf()는 문자의 위치를 찾아주는 메서드
		//프로그래밍 언어는 0부터 인덱스를 붙임,많이 사용함
		System.out.println(str6.indexOf('f'));
		
		//charAt()는 8번째 문자를 구하는 메서드,많이 사용함
		System.out.println(str6.charAt(8));
		//replaceAll()은 문자열을 다른 문자열로 치환(바꿈)
		System.out.println(str4.replaceAll("java", "자바는 어렵당"));
		//substring()은 문자열의 일부분을 구할 때 사용(시작인덱스,끝인덱스)
		//7번째부터 11번째까지의 문자열만 추출,많이 사용함
		System.out.println(str1.substring(7,11));
		//toUpperCase()는 모든 문자열을 대문자로 변환
		System.out.println(str1.toUpperCase());
		//toLowerCase()는 모든 문자열을 대문자로 변환
		System.out.println(str1.toLowerCase());
		
	}

}


























