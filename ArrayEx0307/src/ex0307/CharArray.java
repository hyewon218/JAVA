package ex0307;

public class CharArray {

	public static void main(String[] args) {
		char[] alpahabets=new char[26];
		char ch='a';
		
		//ch: 문자형인 alpahabets배열의 값을 암묵적으로
		//정수형으로 변환한 다음 1씩 증가시킴
		for(int i=0 ; i<alpahabets.length; i++, ch++){
			alpahabets[i]=ch;
			//소문자 출력
			System.out.println(alpahabets[i]+", "+(int)ch);
		}
		for(int i=0; i<alpahabets.length; i++){
			//alpahabets배열에 문자형으로 변환하여 저장
			alpahabets[i]=(char)(alpahabets[i]-32);
		}
		System.out.println("========");
		for(int i=0 ; i<alpahabets.length; i++, ch++){
			//대문자 출력
			System.out.println(alpahabets[i]+", "+(int)alpahabets[i]);
		}
		
	}
}

