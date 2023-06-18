package ex;

import java.text.DecimalFormat;

public class IncomeTest {

	public static void main(String[] args) {
		DecimalFormat df=new DecimalFormat("###,###");
		
		Income income1=new Income();
		income1.setNum(1000);
		income1.setName("유재석");
		income1.setAddr("서울시 마포구");
		income1.setDept("총무부");
		income1.setPosition("부장");
		income1.setSalary(80000000);
		
		System.out.println("직원 번호 : "+income1.getNum());
		System.out.println("직원 이름 : "+income1.getName());
		System.out.println("직원 주소 : "+income1.getAddr());
		System.out.println("소속 부서 : "+income1.getDept());
		System.out.println("직원 직급 : "+income1.getPosition());
		System.out.println("연봉 : "+df.format(income1.getSalary()) +"만원");
		System.out.println("유재석의 월 급여: "+df.format(income1.getMonthSalary())+"원");
		
		Income income2=new Income();
		income2.setNum(2000);
		income2.setName("신봉선");
		income2.setAddr("서울시 영등포구");
		income2.setDept("IT부");
		income2.setPosition("과장");
		income2.setSalary(70000000);
		
		System.out.println("직원 번호 : "+income2.getNum());
		System.out.println("직원 이름 : "+income2.getName());
		System.out.println("직원 주소 : "+income2.getAddr());
		System.out.println("소속 부서 : "+income2.getDept());
		System.out.println("직원 직급 : "+income2.getPosition());
		System.out.println("연봉 : "+df.format(income2.getSalary())+"만원");
		System.out.println("신봉선의 월 급여: "+df.format(income2.getMonthSalary())+"원");
		
	}

}
