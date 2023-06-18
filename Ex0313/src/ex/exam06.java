package ex;

public class exam06 {
//부모클래스
	private String stringstudentName="";
	private int kor;
	private int eng;
	private int mat;

	public exam06() {

	}
	
	public String getStudentName() {
		return stringstudentName;
	}
	public void setStdentName(String name) {
		this.stringstudentName=name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor=kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng=eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat=mat;
	}
}
