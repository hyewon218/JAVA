package ex;

public class exam01 {

	public static void main(String[] args) {
		String[] arr= {"떡볶이","쌀국수","냉면","짜장면","닭갈비","피자","샌드위치","파스타","닭발","쫄면"};
		int num=(int)(Math.random()*(arr.length-1));
		
		System.out.println("오늘의 점심 메뉴는? : "+arr[num]);
	}
}




