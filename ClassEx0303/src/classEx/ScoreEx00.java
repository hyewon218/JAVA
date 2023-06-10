package classEx;

public class ScoreEx00 {
	String name;
	int age;
	String date;
	int price;
	String timeType;	
	//정가 : 59800원
	//59800*0.5(50퍼할인)
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getDate() {
		return date;
	}
	public int getPrice() {
		return price;
	}
	public String getHuman() {
		String human="";
		if(age>=19) {
			human="어른";
		}else {
			human="청소년";
		}
		return human;
	}
	public String getTimeType() {
		return timeType;
	}
	//할인율에 따른 할인가격을 구하는 메서드, 일반형과 기간자유형, 어른과 청소년
	public double getRate( ) {
		double rate=0.0;
	
		
		if(timeType=="일반형") {
			//getHuman()함수 호출하고 그 결과값을 "어른"과 비교
			if(getHuman()=="어른") {
				if(date=="10일용") {
					rate=0.45;
				}else if(date=="1개월용"){
					rate=0.5;
				}else {
					rate=0.0;
				}
			//일반형->청소년인 경우	
			}else {
				rate=0.6;
			}
		}else if(timeType=="기간자유형"){
			if(getHuman()=="어른") {
				if(date=="10일~20일") {
					rate=0.5;
				}else {
					rate=0.0;
				}
			}else {
				rate=0.6;
			}
			//일반형도 아니고, 기간자유형도 아닌 경우
		}else {
			rate=0.0;
		}
		return rate;
	}
	
	public double getDiscount() {
		double discount=0.0;
		//할인율을 적용한 할인가 구하기
		discount=price-(price*getRate());
		return discount;
	}

	public static void main(String[] args) {
		//유재석, 기간자유형, 어른, 50% 할인받음
		ScoreEx00 score =new ScoreEx00();
		score.name="유재석";
		score.age=30;
		score.price=59800;
		score.date="10일용"; 
		score.timeType="일반형";

		System.out.println("유형 : "+score.getTimeType());
		System.out.println("나이 : "+score.getAge()+"세");
		System.out.println("구분 : "+score.getHuman());
		System.out.println("날짜 : "+score.getDate());
		System.out.println("이름 : "+score.getName()+"님");
		System.out.println("정가 : "+score.getPrice()+"원");
		System.out.println("할인율 : "+(int)(score.getRate()*100)+"%");
		System.out.println("할인가 : "+(int)score.getDiscount());
		
		
	}
}
