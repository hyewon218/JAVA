package methods;

public class Subway {
	String lineNumber;
	int passengerCount;
	int money; //지하철 회사 수입
	
	public Subway(String lineNumber) {
		this.lineNumber=lineNumber;
	}
	public void take(int money) {
		//지하철 회사 수입
		this.money+=money;
		//지하철 이용 승객 증가
		passengerCount++;
	}
	public void showInfo() {
		System.out.println(lineNumber+"의 승객은"+passengerCount+"명이고, 수입은 "+money+"입니다.");
	}
}















