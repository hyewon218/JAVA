package array;

public class arrayCopy {

	public static void main(String[] args) {
		int[] array1= {10, 20, 30, 40, 50};
		int[] array2= {1,2,3,4,5};
		
		//복사할배열, 복사할첫위치, 대상배열, 붙여넣을첫위치, 복사할요소개수
		System.arraycopy(array1, 0, array2, 1, 4);
		for(int i=0; i<array2.length; i++) {
			System.out.println(array2[i]);
		}
	}
}


