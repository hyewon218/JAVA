package methods;

public class Bus {
	int busNumber;
	int passengerCount;
	int money;//버스 회사 수입
	
	public Bus(int busNumber) {
		this.busNumber=busNumber;
	}
	public void take(int money) {
		//버스 회사 수입
		this.money +=money;
		//버스 이용 승객 증가
		passengerCount++;
	}
	public void showInfo() {
		System.out.println("버스"+busNumber+"번의 승객은 "+passengerCount+"명이고, 수입은"+money+"입니다.");
	}
}













