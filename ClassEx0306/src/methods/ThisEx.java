package methods;
//클래스
class BirthDay {
	int day;
	int month;
	int year;
	
	public void setYear(int year) {
		this.year=year;
	}
	public void printThis() {
		//this : 클래스 자체
		System.out.println(this);
	}
}
//메인 클래스
public class ThisEx {
	public static void main(String[] args) {
		//BirthDay클래스를 사용하여 인스턴스 생성
		BirthDay bDay=new BirthDay();
		bDay.setYear(2023);
		System.out.println(bDay);
		bDay.printThis();
	}
}

