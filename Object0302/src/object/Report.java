package object;

public class Report {
	//설계도
	String name;
	String depart;
	int kor;
	int eng;
	int mat;

	public String getName() {
		return name;
	}
	public String getDepart() {
		return depart;
	}	
	public int getTotal() {
		//total은 getTotal 함수 내에서만 사용 가능한 지역변수
		int total=kor+eng+mat;
		return total;
	}
	public float getAvg() {
		float avg=(float)(kor+eng+mat)/3.0f;
		return avg;
	}
	public String getComplete() {
		float avg=(float)(kor+eng+mat)/3.0f;
		String res;
		if(avg>=60) {
			res="이수";		
		}else {
			res="미이수";
		}
		return res;
	}
	public static void main(String[] args) {
		//클래스 Report를 사용한 인스턴트 생성
		Report sdt=new Report();
		//sdt인스턴스의 변수에 값을 입력
		sdt.name="박명수";
		sdt.depart="수학과";
		sdt.kor=80;
		sdt.eng=70;
		sdt.mat=60;

		
		//멤버함수의 값을 출력
		System.out.println("학생 이름 : "+sdt.name);
		System.out.println("학생 학과 : "+sdt.depart);
		System.out.println("국어 점수 : "+sdt.kor);
		System.out.println("영어 점수 : "+sdt.eng);
		System.out.println("수학 점수 : "+sdt.mat);
		System.out.println("총점 : "+sdt.getTotal());
		System.out.println("평균 : "+sdt.getAvg());
		System.out.println("이수 여부: "+sdt.getComplete());
		
		//다른 인스턴스 생성
		Report usinerse=new Report();
		usinerse.name="서장훈";
		usinerse.depart="체육학과";
		usinerse.kor=80;
		usinerse.eng=40;
		usinerse.mat=50;
		
		System.out.println("학생 이름 : "+usinerse.name);
		System.out.println("학생 학과 : "+usinerse.depart);
		System.out.println("국어 점수 : "+usinerse.kor);
		System.out.println("영어 점수 : "+usinerse.eng);
		System.out.println("수학 점수 : "+usinerse.mat);
		System.out.println("총점 : "+usinerse.getTotal());
		System.out.println("평균 : "+usinerse.getAvg());
		System.out.println("이수 여부: "+usinerse.getComplete());
	}

}
