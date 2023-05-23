package home;

public class HomeWork03 {

	public static void main(String[] args) {
		
		int[] su= {-10,0,6,-7,8,2,-3,3,5,10};
		int sum1=0;
		int sum2=0;
		
		for(int i=0; i<su.length; i++) {
			if(su[i]<0) {
				sum1+=su[i];
				
			}else {
				sum2+=su[i];
			}
		}
		System.out.println("음수들의 합 : "+sum1);
		System.out.println("양수들의 합 : "+sum2);
	}

}
