package ex;

public class exam06_Parent {

	public static void main(String[] args) {
		//exam06 exam1=new exam06();
		exam06_Child exam_child=new exam06_Child();
		
		exam_child.setStdentName("유재석");
		exam_child.setKor(70);
		exam_child.setEng(80);
		exam_child.setMat(65);
		exam_child.total();
		System.out.println("학생이름 :"+exam_child.getStudentName());
		System.out.println("국어점수 :"+exam_child.getKor());
		System.out.println("영어점수 :"+exam_child.getEng());
		System.out.println("수학점수 :"+exam_child.getMat());
		System.out.println("총점 :"+exam_child.total());
		//평균을 소수점 둘째짜리까지 출력하기
		String res=String.format("%.2f", exam_child.avg());
		System.out.println("평균 :"+res);
		
		exam06_Child exam_child2=new exam06_Child();
		
		System.out.println();
		exam_child2.setStdentName("이미주");
		exam_child2.setKor(90);
		exam_child2.setEng(75);
		exam_child2.setMat(70);
		System.out.println("학생이름 :"+exam_child2.getStudentName());
		System.out.println("국어점수 :"+exam_child2.getKor());
		System.out.println("영어점수 :"+exam_child2.getEng());
		System.out.println("수학점수 :"+exam_child2.getMat());
		System.out.println("총점 :"+exam_child2.total());
		//평균을 소수점 둘째짜리까지 출력하기
		String res2=String.format("%.2f", exam_child2.avg());
		System.out.println("평균 :"+res2);
	}
}
