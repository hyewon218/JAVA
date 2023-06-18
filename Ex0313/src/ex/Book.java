package ex;

public class Book {

private String bookName;
private String authorName;
private String company;
private String day;
private int price;
int discount;

	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName=bookName;
	}
	public String getAutorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName=authorName;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company=company;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day=day;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public int discount() {
		discount=(int)(price-(price*0.1));
		return discount;
	}
}
