package ex;

public class exam06_Child extends exam06{
//자식클래스
	int total;
	double avg;
	
	public int total() {
	total=getKor()+getEng()+getMat();
	
	return total;
	}
	
	public double avg() {
	avg=(double)total/3;
	
	return avg;
	}

}
