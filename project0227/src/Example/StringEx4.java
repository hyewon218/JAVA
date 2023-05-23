package Example;

public class StringEx4 {

	public static void main(String[] args) {
		
		String st1="오늘은 날씨가 화창합니다.";
		String st2="개나리,진달래,철쭉,무궁화,장미,해바라기";
		String st3="겨울";
		//무궁화만 추출하여 st4에 저장
		String st4=st2.substring(11, 14);
		
		System.out.println(st1);
		//'화'글자의 인덱스 번호
		System.out.println(st1.indexOf('화'));
		//5번째 인덱스 번호에 해당하는 글자
		System.out.println(st1.charAt(5));
		
		System.out.println(st4);
		//전체 치환
		System.out.println(st3.replaceAll("겨울", "봄이 오고 있어요"));
		System.out.println();
		
		String[] arr=st2.split(",");
		
		for(int i=0; i<arr.length; i++) {
		System.out.println(i+","+arr[i]);
		}
		
		System.out.println(arr.length);
	
	}

}
