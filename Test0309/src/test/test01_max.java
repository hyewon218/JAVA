package test;

public class test01_max {

	public static void main(String[] args) {
		//최대값 구하기
		int arr[]= {46,87,100,5,36,27,42,53,18,16,7,91};
		int max=0;
		for(int i=0; i<arr.length; i++) {
			//만약 배열 arr의 값이 max보다 크면 max에 배열 arr값을 저장
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("최대값:"+max);
	}
}



