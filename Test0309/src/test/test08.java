package test;

public class test08 {

	public static void main(String[] args) {
		//삽입정렬
		int imsi=0;
		int[] n= {6,9,1,10,3,5,7,2,8,4};
		//배열의 두번째 값을 저장할 변수 선언
		int key=0;
		//배열의 원본값 출력
		for(int i=0; i<n.length; i++) {
			System.out.print(n[i]+",");
		}
		System.out.println();
		System.out.println("========회전 결과=======");
		//삽입정렬
		for(int i=1; i<n.length; i++) {
			//key변수에 배열의 두번째 값을 저장
			key=n[i];
			System.out.println();
			System.out.println(i+"회전***");
			for(int j=i-1; j>=0; j--) {//앞쪽(왼쪽)과 비교
				if(key<n[j]) {
					//뒤로 한자리씩 값을 밀어버림(자리를 바꾸는 게x)
					imsi=n[j+1];
					n[j+1]=n[j];
					n[j]=imsi;
				}
			}
			for(int k=0; k<n.length; k++) {
				System.out.print(n[k]+",");
			}
		}
		//정렬된값 출력
		System.out.println();
		System.out.println("========최종결과========");
		for(int i=0; i<n.length; i++) {
			System.out.print(n[i]+",");
		}
	}
}

