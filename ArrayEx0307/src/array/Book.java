package array;

public class Book {
	private String bookName;
	private String author;
	//디폴트 생성자
	public Book() {}
	//생성자(멤버변수 초기화)
	public Book(String bookName, String author) {
		this.bookName=bookName;
		this.author=author;
	}
	public String getBookName() {
		return bookName;
	}
	//외부에서 받아와서 넣어주는 역할
	public void setBookName(String bookName) {
		this.bookName=bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author=author;
	}
	public void showBookInfo() {
		System.out.println(bookName+","+author);
	}
}

