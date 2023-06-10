package home;

public class Everland {
		
		String name;
		String day;
		int age;
		int people;
		
		public String getName() {
			return name;
		}
		public String getDay() {
			return day;
		}
		public int getAge() {
			return age;
		}
		public int getPeople () {
			return people;
		}
		public String DayType() {
			String dayType="";
			
			switch (dayType) {
				case "월","화","수","목": dayType="A";
				  break;
				case "금" : dayType="B";
					break;
				case "토" : dayType="C";
					break;
				case "일" : dayType="D";
					break;
				
			default: break;
			}
			return dayType;
		}
		public int Price() {
			int price=0;
			
			if((age>=13&&age<=18)||(age>=19&&age<=64)) {
				if(DayType()=="A") {
					price=62000;
				}else if(DayType()=="B") {
					price=52000;
				}else if(DayType()=="C"){
					price=46000;
				}else {
					price=68000;
				}
			}else if((age>=3&&age<=12)||(age>=65)){
				if(DayType()=="A") {
					price=52000;
				}else if(DayType()=="B") {
					price=42000;
				}else if(DayType()=="C"){
					price=36000;
				}else {
					price=58000;
				}
			}else {
				price=0;
			}
			return price;
		}
		
		public static void main(String[] args) {
			Everland everland =new Everland();
			Everland everland2 =new Everland();
			everland.name="김하니";
			everland.day="일";
			everland.age=17;
			everland.people=2;
			
			everland2.name="이해린";
			everland2.day="일";
			everland2.age=11;

			System.out.println("이름 : "+everland.getName());
			System.out.println("나이 : "+everland.getAge());
			System.out.println("에버랜드 가는 요일 : "+everland.getDay()+"요일");
			System.out.println("에버랜드 같이 가는 인원 : "+everland.getPeople()+"명");
			System.out.println("가격 : "+everland.Price());
			System.out.println("=======================");
			System.out.println("동반1인 정보");
			System.out.println("이름 : "+everland2.getName());
			System.out.println("나이 : "+everland2.getAge());
			System.out.println("에버랜드 가는 요일 : "+everland2.getDay()+"요일");
			System.out.println("가격 : "+everland2.Price());
		}
	
}
