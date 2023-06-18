package ex;

public class SalaryMan {
//부모클래스
	private int num;//직원번호
	private String name;//직원이름
	private String addr;//주소
	private String dept;//소속부서
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num=num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr=addr;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept=dept;
	}
}
