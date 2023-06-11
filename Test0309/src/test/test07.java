package test;

public class test07 {

	public static void main(String[] args) {
		//selection sort(선택정렬)-오름차순
		//선택정렬 알고리즘(오름차순 기준)
				int imsi=0;
				int[] n= {6,9,1,10,3,5,7,2,8,4};
				//배열의 원본값 출력
				for(int i=0; i<n.length; i++) {
					System.out.print(n[i]+",");
				}
				System.out.println();
				System.out.println("========회전 결과=======");
				//선택정렬
				for(int i=0; i<n.length; i++) {
					//+1을 하는 이유는 자기와 비교할 필요가 없기 때문
					System.out.println();
					System.out.println((i+1)+"회전***");
					for(int j=i+1; j<n.length; j++) {
						if(n[i]>n[j]) {// >:오름차순, <:내림차순
							imsi=n[i];//값을 변경해야하기에 임시 저장
							n[i]=n[j];//j를 i로 변경
							n[j]=imsi;//i를 j로 변경
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


