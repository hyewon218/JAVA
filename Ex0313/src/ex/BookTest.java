package ex;

public class BookTest {

	public static void main(String[] args) {
		Book book1=new Book();
		Book book2=new Book();
		book1.setBookName("진짜 쓰는 실무 엑셀");
		book1.setAuthorName("진진권");
		book1.setCompany("제이펍");
		book1.setDay("2022-02-15");
		book1.setPrice(21000);
		
		book2.setBookName("JAVA Programming");
		book2.setAuthorName("황기태");
		book2.setCompany("생능출판");
		book2.setDay("2018-06-01");
		book2.setPrice(33000);
		
		System.out.println("책이름 : "+book1.getBookName());
		System.out.println("저자이름 : "+book1.getAutorName());
		System.out.println("출판사 : "+book1.getCompany());
		System.out.println("출판일 : "+book1.getDay());
		System.out.println("교재비 : "+book1.getPrice()+"원 ->10%할인-> "+book1.discount()+"원");
		System.out.println();
		System.out.println("책이름 : "+book2.getBookName());
		System.out.println("저자이름 : "+book2.getAutorName());
		System.out.println("출판사 : "+book2.getCompany());
		System.out.println("출판일 : "+book2.getDay());
		System.out.println("교재비 : "+book2.getPrice()+"원 ->10%할인-> "+book2.discount()+"원");
	}

}
