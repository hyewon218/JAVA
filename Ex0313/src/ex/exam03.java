package ex;

public class exam03 {

	public static void main(String[] args) {
		//배열에 문자열 데이터 10개 저장하고
		//그 배열의 값들 중 만두의 개수를 세어서 출력하기
		int count=0;
		String [] str= {"만두","김밥","만두","라면","딤섬","쫄면","국수","떡볶이","만두","비빕밥"};
		
		for(int i=0; i<str.length; i++) {
			if(str[i]=="만두") {
				count++;
			}
		}
		System.out.println("만두의 갯수 : "+count);
	}
}




