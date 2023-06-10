package ec0308;

public class Employ {
	private String name;
	private int age;
	private String rank;
	private double pay;
	//생성자
	public Employ(String name,int age,String rank,int pay) {
		this.name=name;
		this.age=age;
		this.rank=rank;
		this.pay=pay;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank=rank;
	}
	public double getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay=pay;
	}
	//보너스, 세금, 실수령액 계산하는 메서드
	public double Bonus() {
		double bonus=0;
		if(rank=="부장") {
			bonus=this.pay*0.17;
		}else if(rank=="차장") {
			bonus=this.pay*0.15;
		}else if(rank=="과장") {
			bonus=this.pay*0.13;
		}else if(rank=="대리") {
			bonus=this.pay*0.10;
		}else if(rank=="주임") {
			bonus=this.pay*0.07;
		}else {
			bonus=this.pay*0.05;
		}
			return bonus;
	}
	public double Tax() {
		double tax=(this.pay+Bonus())*0.05;
			return tax;
	}
	public double Income() {
		double income=pay+Bonus()-Tax();
		return income;
	}
	//외부클래스에서 호출하면 정보를 보여주는 메서드
	public String showInfo() {
		String showName=this.name;
		String showAge=String.valueOf(age);
		String showRank=this.rank;
		String showPay=String.valueOf(this.pay);
		
		return "이름은 "+showName+"이고, 나이는 "+showAge+"세 입니다."
		+"직급은"+showRank+"이고, 기본급은 "+showPay+"입니다."
		+" 보너스는 "+(int)Bonus()+"원입니다."
		+"세금은 "+(int)Tax()+"원입니다."
		+"실급여는"+(int)Income()+"원입니다.";
	}
}













