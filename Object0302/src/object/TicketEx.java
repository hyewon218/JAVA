package object;

public class TicketEx {
	String name;
	int age;
	String grade;
	String place;
	// �޼���(����� �ϴ� ��ɾ��� ����:�Լ�)
	// get: ���� ������ �Լ�/set: ���� �����ϴ� �Լ�
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String ageShow() {
		// ����� ������ �׸�(�ʱ�ȭ �����ֱ�!)
		String show = "";
		if (age >= 14) {
			show = "��������";
		} else {
			show = "�����Ұ�";
		}
		return show;
	}
	public String getGrade() {
		return grade;
	}
	public int priceDecide() {

		int price = 0;
		switch (grade) {
		case "VIP��": price = 160000;
			break;// �ʼ�!!!!!
		case "R��": price = 140000;
			break;
		case "S��": price = 110000;
			break;
		case "A��": price = 80000;
			break;
		default: price = 0;
		}
		return price;
	}
	public String getPlace() {
		return place;
	}
	// ���̰� 14�� �̻��̸� ��� ����ϰ�, ���̰� 14�� �̸��̸� ��ҿ� "����"���
	public String placeShow() {
		String placeshow = "";
		if (age >= 14) {
			placeshow = "����";
		} else {
			placeshow = "����";
		}
		return placeshow;
	}
	public static void main(String[] args) {
		//
		TicketEx ticket = new TicketEx();
		TicketEx ticket2 = new TicketEx();
		
		ticket.name = "��ǹ�";
		ticket.age = 29;
		ticket.grade = "S��";
		ticket.place = "���Ե�������";

		System.out.println("�̸� : " + ticket.getName());
		System.out.println("���� : " + ticket.getAge() + "��(" + ticket.ageShow() + ")");
		System.out.println("���� : " + ticket.getGrade() + "-" + ticket.priceDecide() + "��");
		System.out.println("��� : " + ticket.placeShow());

		System.out.println();

		ticket2.name = "���缮";
		ticket2.age = 13;
		ticket2.grade = "";
		ticket2.place = "";

		System.out.println("�̸� : " + ticket2.getName());
		System.out.println("���� : " + ticket2.getAge()+ "��(" + ticket2.ageShow() + ")");
		System.out.println("���� : " + ticket2.getGrade() + "-" + ticket2.priceDecide() + "��");
		System.out.println("��� : " + ticket2.placeShow());
	}

}
