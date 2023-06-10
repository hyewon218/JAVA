package array;

public class ForLoop {

	public static void main(String[] args) {
		String[] strArray={"Java","Android","C","JavaScript","Python"};
		//향상된 for문
		for(String lang:strArray) {
			System.out.println(lang);
		}
		System.out.println("================");
		for(int lang=0; lang<strArray.length; lang++) {
			System.out.println(strArray[lang]);
		}
	}
}

