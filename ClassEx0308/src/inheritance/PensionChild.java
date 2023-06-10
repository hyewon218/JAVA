package inheritance;

public class PensionChild extends Pension{
	//고객정보
	//부모 클래스 Pension의 변수와 메서드를 상속받아서 그걸로 인스턴트 생성
	private String guestName;
	private int guestAge;
	private String relation;
	//생성자(멤버변수의 값을 초기화)
	public PensionChild() {
		this.guestName="";
		this.guestAge=0;
		this.relation="";
	}
	//외부로 전달(출력)
	public String getGuestName() {
		return guestName;
	}
	public void setGuestName(String gName) {
		this.guestName=gName;
	}
	public int getGuestAge() {
		return guestAge;
	}
	public void setGuestAge(int age) {
		this.guestAge=age;
	}
	public String getRelation() {
		return relation;
	}
	public void setRelation(String rel) {
		this.relation=rel;
	}
	
	public String showInfo() {
		return this.guestAge+"세 "+this.guestName+"씨가 "+this.relation
			   +" "+getPnum()+"명과 함께 "+getPname()+"에 "+getPday()
	           +"일동안 놀러가는 비용은 "+charge()+"원입니다.";
	}
}



