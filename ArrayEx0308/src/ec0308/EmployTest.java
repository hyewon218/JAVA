package ec0308;

import java.util.ArrayList;

public class EmployTest {

	public static void main(String[] args) {
		//employ클래스를 이용하여 인스턴스 객체 배열 생성
		ArrayList<Employ> employ=new ArrayList<Employ>();
		employ.add(new Employ("김", 30, "부장",5000000));
		employ.add(new Employ("이", 40, "차장",4500000));
		employ.add(new Employ("박", 30, "과장",4000000));
		employ.add(new Employ("최", 50, "대리",3500000));
		employ.add(new Employ("정", 20, "주임",3000000));
		employ.add(new Employ("차", 25, "사원",2500000));
		
		for(int i =0; i<employ.size(); i++) {
			System.out.println(employ.get(i).showInfo());
		}
		System.out.println("=======================향상된for문=========================");
		for(Employ i:employ) {
			System.out.println(i.showInfo());
		}
	}
}


