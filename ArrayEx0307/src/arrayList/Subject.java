package arrayList;

public class Subject {
	private String name;   //과목명
	private int scorePoint;//점수
	
	//과목명을 외부로 전달하는 메서드
	public String getName() {
		return name;
	}
	//외부에서 받아온 과목명을 멤버변수에 전달
	public void setName(String name) {
		this.name=name;
	}
	//점수를 외부로 전달하는 메서드
	public int getScorePoint() {
		return scorePoint;
	}
	//외부에서 받아온 점수를 멤버변수에 전달하는 메서드
	public void setScorePoint(int scorePoint) {
		this.scorePoint=scorePoint;
	}
}

