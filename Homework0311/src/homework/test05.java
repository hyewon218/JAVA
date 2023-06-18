package homework;

public class test05 {

	public static void main(String[] args) {
		// 1~100사이의 무작위 정수(랜덤 )을 10개 발생시켜 배열에 저장한 다음
		// 그 수들을 출력하고, 선택정렬한 결과 값도 출력하기
		int[] n=new int[10];
		int imsi=0;

		System.out.print("랜덤숫자 정렬 전 : ");
		for (int i=0; i<n.length; i++) {
			n[i]=(int)(Math.random()*99)+1;
			if (i<n.length-1) {
				System.out.print(n[i] + ",");
			} else {
				System.out.println(n[i]);
			}
		}
		for (int i=0; i<n.length; i++) {
			for (int j=i+1; j<n.length; j++) {
				if (n[i]>n[j]) {//i값과j값 비교
					imsi=n[i];
					n[i]=n[j];
					n[j]=imsi;
				}
			}
		}
		System.out.println("----------------------------------------");
		System.out.print("랜덤숫자 정렬 후 : ");
		for (int i=0; i<n.length; i++) {
			if (i<n.length-1) {
				System.out.print(n[i]+",");
			} else {
				System.out.println(n[i]);
			}
		}
	}
}


