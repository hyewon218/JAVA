package ex0307;

public class DogTest {

	public static void main(String[] args) {
		//Dog클래스를 이용하여 객체 배열 5개 생성
		Dog[] dogs=new Dog[5];
		dogs[0]=new Dog("마루", "말티즈");
		dogs[1]=new Dog("송이", "말티푸");
		dogs[2]=new Dog("콩지", "토이푸들");
		dogs[3]=new Dog("체리", "자브종");
		dogs[4]=new Dog("멍멍이", "포메라니안");	
		
		for(int i =0; i<dogs.length; i++) {
			System.out.println(dogs[i].showDogInfo());
		}
		System.out.println("===향상된for문===");
		for(Dog dog:dogs) {
			System.out.println(dog.showDogInfo());
		}
	}
}





