package ex;

public class Income extends SalaryMan {
//자식클래스
	private String position;//직급
	private long salary;//연봉
	double monthSalary;//월급
	
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position=position;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary=salary;
	}
	public double getMonthSalary() {
		monthSalary= (double)salary/12 ;
		return monthSalary;
	}
}
