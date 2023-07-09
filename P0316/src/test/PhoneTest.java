package test;

public class PhoneTest {

	public static void main(String[] args) {
		PhoneGuest guest=new PhoneGuest();
		Phone iphone=new Iphone();
		System.out.println(iphone.showInfo());
		Phone galaxy=new Galaxy();
		System.out.println(galaxy.showInfo());
		guest.totalPrice1(new Iphone());
		guest.totalPrice1(new Galaxy());
		//System.out.println(guest.totalPrice(iphone));
		//System.out.println(guest.totalPrice(galaxy));

	}

}
