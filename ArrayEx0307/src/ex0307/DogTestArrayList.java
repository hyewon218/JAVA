package ex0307;
import java.util.ArrayList;

public class DogTestArrayList {
	public static void main(String[] args) {

		ArrayList<Dog> dogs = new ArrayList<Dog>();
		dogs.add(new Dog("마루", "말티즈"));
		dogs.add(new Dog("송이", "말티푸"));
		dogs.add(new Dog("콩지", "토이푸들"));
		dogs.add(new Dog("체리", "자브종"));
		dogs.add(new Dog("멍멍이", "포메라니안"));	
		
		for(int i =0; i<dogs.size(); i++) {
			System.out.println(dogs.get(i).showDogInfo());
		}
		System.out.println("===향상된for문===");
		for(Dog dog:dogs) {
			System.out.println(dog.showDogInfo());
		}
	}
}



