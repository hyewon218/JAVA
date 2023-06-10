package arrayList;

import java.util.ArrayList;

public class Student {
	int studentID;		//학생번호
	String studentName; //학생이름
	//자료형으로 Subject 클래스 가져옴
	ArrayList<Subject> subjectList; //학생이 수강할 과목 리스트
	
	//생성자(학생정보 받아와 멤버변수를 초기화하는 역할)
	public Student(int studentID, String studentName) {
		this.studentID=studentID;
		this.studentName=studentName;
		//초기화
		subjectList=new ArrayList<Subject>();
	}
	//과목이름,과목점수를 전달받아서 subjectList 객체에 리스트 추가
	public void addSubject(String name, int score) {
		//Subject클래스로 Subject인스턴스 생성
		Subject subject=new Subject();
		subject.setName(name);
		subject.setScorePoint(score);
		//통으로 List에 추가
		subjectList.add(subject);
	}
	public void showStudentInfo() {
		int total=0;
		//Subject로 만들어진 객체(s)(과목) 갯수만큼 반복
		for(Subject s:subjectList) {
			//s객체의 getScorePoint메서드의 결과값을 total에 더하기(누적합)
			total +=s.getScorePoint();
			System.out.println("학생"+studentName+"의 "+s.getName()+" 과목 성적은 "+s.getScorePoint()+"점입니다." );
		}
		System.out.println("학생"+studentName+"의 총점은 "+total+"점입니다.");
	}
}

