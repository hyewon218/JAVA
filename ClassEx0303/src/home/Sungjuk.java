package home;

public class Sungjuk {
	// 멤버변수
	String name;
	int kor;
	int eng;
	int mat;
	// 총점 구하는 메서드
	public int sum() {
		int sum = kor + eng + mat;
		return sum;
	}
	// 평균 구하는 메서드
	public double avg() {
		// sum()는 sum함수를 호출함
		double avg = (double) (sum()) / 3.0;
		return avg;
	}
	// 학점을 구하는 메서드
	public char grade() {
		char grade = 'F';
		// 평균이 90점 이상이면 학점은 'A'
		if (avg() >= 90.0) {
			grade = 'A';
			// 평균이 80점 이상 90점 미만이면 학점은 'B'
		} else if (avg() >= 80.0) {
			grade = 'B';
		} else if (avg() >= 70.0) {
			grade = 'C';
		} else if (avg() >= 60.0) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		return grade;
	}

	public static void main(String[] args) {
		// 인스턴스 생성
		Sungjuk score = new Sungjuk();
		score.name = "김일등";
		score.kor = 80;
		score.eng = 90;
		score.mat = 100;
		System.out.println("이름:" + score.name);
		System.out.println("국어:" + score.kor);
		System.out.println("영어:" + score.eng);
		System.out.println("수학:" + score.mat);
		System.out.println("총점:" + score.sum());
		System.out.println("평균:" + score.avg());
		System.out.println("학점:" + score.grade());
		System.out.println("==============");
		Sungjuk score2 = new Sungjuk();
		score2.name = "최삼등";
		score2.kor = 60;
		score2.eng = 70;
		score2.mat = 80;
		System.out.println("이름:" + score2.name);
		System.out.println("국어:" + score2.kor);
		System.out.println("영어:" + score2.eng);
		System.out.println("수학:" + score2.mat);
		System.out.println("총점:" + score2.sum());
		System.out.println("평균:" + score2.avg());
		System.out.println("학점:" + score2.grade());
		System.out.println("==============");
		Sungjuk score3 = new Sungjuk();
		score3.name = "나사등";
		score3.kor = 50;
		score3.eng = 60;
		score3.mat = 40;
		System.out.println("이름:" + score3.name);
		System.out.println("국어:" + score3.kor);
		System.out.println("영어:" + score3.eng);
		System.out.println("수학:" + score3.mat);
		System.out.println("총점:" + score3.sum());
		System.out.println("평균:" + score3.avg());
		System.out.println("학점:" + score3.grade());
		System.out.println("==============");
	}
}
