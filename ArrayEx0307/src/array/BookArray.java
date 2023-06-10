package array;

public class BookArray {

	public static void main(String[] args) {
		//객체 배열 성생
		Book[] library=new Book[5];
		//인스턴스 생성 후 배열에 저장
		library[0]=new Book("태백산맥","조정래");
		library[1]=new Book("데미안","헤르만 헤세");
		library[2]=new Book("어떻게 살 것인가","유시민");
		library[3]=new Book("토지","박경리");
		library[4]=new Book("어린왕자","생텍쥐페리");
		
		//Book 인스턴스 멤버들
		for(int i=0; i<library.length; i++) {
			library[i].showBookInfo();
		}
		//Book 인스턴스를 저장한 메모리 공간 주소
		for(int i=0; i<library.length; i++) {
			System.out.println(library[i]);
		}
	}
}






