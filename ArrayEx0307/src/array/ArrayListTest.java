package array;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<Book> library=new ArrayList<Book>();
		
		library.add(new Book("세이노의 가르침","세이노"));
		library.add(new Book("한국형 가치투자","최준철"));
		library.add(new Book("원씽","게리 켈러"));
		library.add(new Book("메리골드 마음 세탁소","윤정은"));
		library.add(new Book("구의 증명","최진영"));
		
		for(int i=0; i<library.size(); i++) {
			Book book=library.get(i);
			book.showBookInfo();
		}
		System.out.println();
		
		System.out.println("===향상된 for문 사용===");
		for(Book book:library) {
			book.showBookInfo();
		}
	}
}



