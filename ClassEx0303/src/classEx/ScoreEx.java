package classEx;

public class ScoreEx {
	
	String name;
	int age;
	String date;
	int price;
	String timeType;
	
	int term;
	//어른(19살이상)/청소년(19살미만)
	String adult;
	String type;
	//날짜
	//1개월은 31일,1개월용 :10일이상30일 미만
	
	//정가 : 59800원
	//59800*0.5(50퍼할인)
	//price-(price*0.5)
	//조건문 안에 조건문
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
	public int getTimeType() {
		return price;
	}
	public String getTerm() {
		String type="";
		if(term==10||term==30) {
			type="일반형";
		}else {
			type="기간자유형";
		}
		return type;
	}
	//일반형과 기간자유형을 나눈다
	public String type() {
		return type;
	}
	
	public String isAdutl() {
		String discount ="";
			if(age>=19) {
				if(getTerm()=="일반형") {
					if(term==10) {
						discount="45";
					}else if(term==30) {
						discount="50";
					}else {
						discount="";
					}
						
				}else if(getTerm()=="기간자유형") {
					if(term>9&&term<21) {
						discount="45";
					}else if(term>20&&term<31) {
						discount="50";
					}else {
						discount="";
				}
			//청소년
			}else if(age<19) {
				if(getTerm()=="일반형") {
					if(term==10&&term==30) {
						discount="60";
					}else {
						discount="";
					}
				}else if(getTerm()=="기간자유형") {
					if(term>9&&term<31) {
						discount="60";
					}else {
						discount="";
					}
					}
				}
			}
		
		return discount;
	}
	//할인율이없으면 가격그대로 출력하기!!!
	//할인율얻어서 가격구하기
	public int getDiscount() {
		int discountPrice=0;
		
		if(isAdutl()=="45") {
			discountPrice=(int)(price-(price*0.45));
		}else if(isAdutl()=="50") {
			discountPrice=(int)(price-(price*0.5));
		}else if(isAdutl()=="60") {
			discountPrice=(int)(price-(price*0.6));
		}else {
			discountPrice=price;
		}
		return discountPrice;
	}


	
	public static void main(String[] args) {
		//유재석, 기간자유형, 어른, 50% 할인받음
		ScoreEx score =new ScoreEx();
		score.name="유재석";
		score.age=30;
		//기본가격
		score.price=59800;
		score.term=22;
		System.out.println("이름 : "+score.getName());
		System.out.println("나이 : "+score.getAge());
		System.out.println("기간 : "+score.getTerm());
		System.out.println("할인율 : "+score.isAdutl());
		System.out.println("할인된 가격 : "+score.getDiscount());
		
		
	}


}
