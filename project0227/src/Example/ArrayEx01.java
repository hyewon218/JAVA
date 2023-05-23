package Example;

public class ArrayEx01 {

	public static void main(String[] args) {
		//str배열에 데이터 저장
/*		String str="사과,복숭아,딸기,자몽,샤인머스켓,천혜향";
		String [] arr=str.split(",");*/
		int num=0;
		String [] str= {"사과","복숭아","딸기","자몽","샤인머스켓","천혜향"};
 		int total=str.length;
		
		for(int i=0; i<str.length; i++) {
			System.out.println("str["+i+"]="+str[i]);
			//만약 str배열의 값이 "자몽"이면 그 배열의 인덱스 번호를 num에 저장
			if(str[i]=="자몽") {
				num=i;
			}
		}
		//4번째
		System.out.println();
		System.out.println("내가 좋아하는 과일은 "+(num+1)+"번 "+str[3]+"이다.");
		System.out.println("내가 좋아하는 과일은 총 "+total+"가지이다.");
		System.out.println();
		str[5]=str[5].replaceAll("천혜향", "레드향");

		for(int i=0; i<str.length; i++) {
			System.out.println(str[i]);
		}
		
		
	}

}
