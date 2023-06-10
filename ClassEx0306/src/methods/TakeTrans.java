package methods;

public class TakeTrans {

	public static void main(String[] args) {
		//Student1클래스를 사용하여 StudentJames인스턴스 생성
		Student1 studentJames=new Student1("제임스", 5000);
		//Student1클래스를 사용하여 StudentTomas인스턴스 생성
		Student1 studentTomas=new Student1("토마스", 10000);
		//Bus클래스로 bus100인스턴스 생성, 초기값은 100(버스번호)
		Bus bus100=new Bus(100);
		//studentJames인스턴스의 takeBus함수(메서드)호출
		//인스턴스의 초기값으로 bus100객체를 전달함.
		studentJames.takeBus(bus100);
		//studentJames의 showInfo함수 호출
		studentJames.showInfo();
		//bus100인스턴스의 showInfo함수 호출
		bus100.showInfo();
		
		Subway subwayGreen=new Subway("2호선");
		studentTomas.takeSubway(subwayGreen);
		studentTomas.showInfo();
		subwayGreen.showInfo();
	}
}

